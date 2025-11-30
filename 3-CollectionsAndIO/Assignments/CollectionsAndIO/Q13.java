// 13) Implement a generic class in Java that stores a collection of elements of any type. Use the class to store strings, integers, and custom objects. Demonstrate the use of wildcard and bounded type parameters.

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) {
        return items.get(index);
    }

    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

public class Q13 {
    public static void printBox(Box<?> box) {
        box.printAll();
    }

    public static double sumNumbers(Box<? extends Number> box) {
        double sum = 0;
        for (int i = 0; i < 3; i++) { // small demo
            sum += box.get(i).doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.add("Hello");
        stringBox.add("World");

        Box<Integer> intBox = new Box<>();
        intBox.add(10);
        intBox.add(20);
        intBox.add(30);

        System.out.println("String box:");
        printBox(stringBox);

        System.out.println("Int box:");
        printBox(intBox);

        System.out.println("Sum of first 3 numbers: " + sumNumbers(intBox));
    }
}
