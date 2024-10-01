import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Shared Buffer
class MessageQueue {
    private BlockingQueue<String> queue;

    public MessageQueue(int capacity) {
        this.queue = new ArrayBlockingQueue<>(capacity);
    }

    public void putMessage(String message) throws InterruptedException {
        queue.put(message);
        System.out.println("Produced: " + message);
    }

    public String takeMessage() throws InterruptedException {
        String message = queue.take();
        System.out.println("Consumed: " + message);
        return message;
    }
}

// Producer Class
class Producer implements Runnable {
    private MessageQueue messageQueue;

    public Producer(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String message = "Message " + i;
                messageQueue.putMessage(message);
                Thread.sleep(100); // Simulate time taken to produce a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Consumer Class
class Consumer implements Runnable {
    private MessageQueue messageQueue;

    public Consumer(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                messageQueue.takeMessage();
                Thread.sleep(150); // Simulate time taken to consume a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Main Class
public class MessagingApp {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue(5);

        Producer producer = new Producer(messageQueue);
        Consumer consumer = new Consumer(messageQueue);

        Thread producerThread = new Thread(producer, "Producer");
        Thread consumerThread = new Thread(consumer, "Consumer");

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Message exchange completed.");
    }
}
