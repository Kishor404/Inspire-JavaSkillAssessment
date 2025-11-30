// 20) Create a HashMap in Java that stores a set of words as keys and their frequencies as values. Implement a method that takes a string as input, splits it into words, and updates the HashMap with their frequencies. Test the method with different inputs.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q20{
    private static Map<String, Integer> wordMap = new HashMap<>();

    public static void updateFrequencies(String text) {
        String[] words = text.toLowerCase().split("\\W+");
        for (String w : words) {
            if (w.isEmpty()) continue;
            wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
        }
    }

    public static void printMap() {
        for (Map.Entry<String, Integer> e : wordMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        updateFrequencies("Hello world hello");
        updateFrequencies("This is a test world");

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        sc.close();

        updateFrequencies(input);
        printMap();
    }
}
