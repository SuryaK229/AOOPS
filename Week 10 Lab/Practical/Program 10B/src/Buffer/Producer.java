package Buffer;
// Producer Class
class Producer implements Runnable {
    private BoundedBuffer boundedBuffer;

    public Producer(BoundedBuffer boundedBuffer) {
        this.boundedBuffer = boundedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) { // Produce 20 items
                boundedBuffer.putItem(i);
                Thread.sleep(100); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}