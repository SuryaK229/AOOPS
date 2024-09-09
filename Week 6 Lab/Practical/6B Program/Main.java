interface MinMax<T extends Comparable<T>> {
    T findMin(T[] array);
    T findMax(T[] array);
}

class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {

    @Override
    public T findMin(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    @Override
    public T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 3, 1, 7, 4};
        String[] strArray = {"apple", "orange", "banana", "pear"};
        Character[] charArray = {'b', 'd', 'a', 'c'};
        Float[] floatArray = {2.3f, 1.4f, 3.7f, 0.8f};

        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>();
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>();
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>();
        MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>();

        System.out.println("Integer array:");
        System.out.println("Min: " + intMinMax.findMin(intArray));
        System.out.println("Max: " + intMinMax.findMax(intArray));

        System.out.println("\nString array:");
        System.out.println("Min: " + strMinMax.findMin(strArray));
        System.out.println("Max: " + strMinMax.findMax(strArray));

        System.out.println("\nCharacter array:");
        System.out.println("Min: " + charMinMax.findMin(charArray));
        System.out.println("Max: " + charMinMax.findMax(charArray));

        System.out.println("\nFloat array:");
        System.out.println("Min: " + floatMinMax.findMin(floatArray));
        System.out.println("Max: " + floatMinMax.findMax(floatArray));
    }
}
