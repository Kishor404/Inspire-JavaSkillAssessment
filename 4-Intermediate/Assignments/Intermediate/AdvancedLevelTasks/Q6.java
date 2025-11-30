// Implement a generic class in Java that stores a collection of elements of any type. Use the class to store strings, integers, and custom objects. Demonstrate the use of wildcard and bounded type parameters.

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.add("Hello");
        stringBox.add("World");

        Box<Integer> intBox = new Box<>();
        intBox.add(1);
        intBox.add(2);

        printBox(stringBox);
        printBox(intBox);
    }

    public static void printBox(Box<?> box) {
        for (Object o : box.getItems()) {
            System.out.println(o);
        }
    }
}