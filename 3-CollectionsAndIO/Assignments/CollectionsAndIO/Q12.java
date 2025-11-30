// 12) Create a Java program that demonstrates the use of ArrayList and LinkedList by adding, removing, and accessing elements in both collections. Compare their performance for large data sets.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q12 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        arrayList.remove(50000);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList remove time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.remove(50000);
        end = System.currentTimeMillis();
        System.out.println("LinkedList remove time: " + (end - start) + " ms");

        System.out.println("ArrayList get(100): " + arrayList.get(100));
        System.out.println("LinkedList get(100): " + linkedList.get(100));
    }
}
