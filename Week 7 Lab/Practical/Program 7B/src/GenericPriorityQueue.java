import java.util.ArrayList;
import java.util.Comparator;

public class GenericPriorityQueue<T extends Comparable<T>> {
    private ArrayList<T> heap;
    private Comparator<T> comparator;

    public GenericPriorityQueue() {
        this.heap = new ArrayList<>();
        this.comparator = Comparator.naturalOrder();
    }

    public GenericPriorityQueue(Comparator<T> comparator) {
        this.heap = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(T element) {
        heap.add(element);
        siftUp(heap.size() - 1);
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        T result = heap.get(0);
        T lastElement = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastElement);
            siftDown(0);
        }
        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void siftUp(int index) {
        T element = heap.get(index);
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T parent = heap.get(parentIndex);
            if (comparator.compare(element, parent) >= 0) {
                break;
            }
            heap.set(index, parent);
            index = parentIndex;
        }
        heap.set(index, element);
    }

    private void siftDown(int index) {
        T element = heap.get(index);
        int half = heap.size() / 2;
        while (index < half) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            int smallerChild = leftChild;
            if (rightChild < heap.size() && comparator.compare(heap.get(rightChild), heap.get(leftChild)) < 0) {
                smallerChild = rightChild;
            }
            if (comparator.compare(element, heap.get(smallerChild)) <= 0) {
                break;
            }
            heap.set(index, heap.get(smallerChild));
            index = smallerChild;
        }
        heap.set(index, element);
    }
}
