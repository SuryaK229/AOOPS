import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectSort {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");

        System.out.println("Original List:");
        for (String s : strings) {
            System.out.println(s);
        }

        Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));

        System.out.println("\nSorted List (Descending Order):");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
