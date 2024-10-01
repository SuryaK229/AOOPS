import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String messageContent = "Message " + i;
            Message message = new Message(messageContent);
            try {
                queue.put(message);
                System.out.println("Produced: " + messageContent);
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Send a termination message
        try {
            queue.put(new Message("exit"));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
