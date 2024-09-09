public class Main {
    public static void main(String[] args) {
        GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>();
        intQueue.add(5);
        intQueue.add(1);
        intQueue.add(3);
        System.out.println("Integer Priority Queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.remove());
        }

        GenericPriorityQueue<Double> doubleQueue = new GenericPriorityQueue<>();
        doubleQueue.add(5.5);
        doubleQueue.add(1.1);
        doubleQueue.add(3.3);
        System.out.println("Double Priority Queue:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.remove());
        }
        
        GenericPriorityQueue<String> stringQueue = new GenericPriorityQueue<>();
        stringQueue.add("banana");
        stringQueue.add("apple");
        stringQueue.add("cherry");
        System.out.println("String Priority Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.remove());
        }
    }
}
