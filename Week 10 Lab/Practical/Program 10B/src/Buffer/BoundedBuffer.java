package Buffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Shared Bounded Buffer
class BoundedBuffer {
    private BlockingQueue<Integer> buffer;

    public BoundedBuffer(int capacity) {
        this.buffer = new ArrayBlockingQueue<>(capacity);
    }

    public void putItem(int item) throws InterruptedException {
        buffer.put(item);
        System.out.println("Produced: " + item);
    }

    public int takeItem() throws InterruptedException {
        int item = buffer.take();
        System.out.println("Consumed: " + item);
        return item;
    }
}
