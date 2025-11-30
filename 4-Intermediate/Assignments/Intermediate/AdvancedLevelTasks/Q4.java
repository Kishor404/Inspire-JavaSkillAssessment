// Create a Java program that demonstrates the use of ArrayList and LinkedList by adding, removing, and accessing elements in both collections. Compare their performance for large data sets.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        arrayList.get(50000);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList get time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.get(50000);
        end = System.currentTimeMillis();
        System.out.println("LinkedList get time: " + (end - start) + " ms");
    }
}