package Buffer;
class Consumer implements Runnable {
    private BoundedBuffer boundedBuffer;

    public Consumer(BoundedBuffer boundedBuffer) {
        this.boundedBuffer = boundedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) { // Consume 20 items
                boundedBuffer.takeItem();
                Thread.sleep(150); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}