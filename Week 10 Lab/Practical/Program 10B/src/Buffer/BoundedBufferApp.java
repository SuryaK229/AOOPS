package Buffer;
public class BoundedBufferApp {
    public static void main(String[] args) {
        BoundedBuffer boundedBuffer = new BoundedBuffer(10);

        Producer producer = new Producer(boundedBuffer);
        Consumer consumer = new Consumer(boundedBuffer);

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

        System.out.println("Buffer operation completed.");
    }
}