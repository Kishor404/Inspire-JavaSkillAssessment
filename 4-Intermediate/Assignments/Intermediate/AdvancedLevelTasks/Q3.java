// Create a HashMap in Java that stores a set of words as keys and their frequencies as values. Implement a method that takes a string as input, splits it into words, and updates the HashMap with their frequencies. Test the method with different inputs.

import java.util.HashMap;

public class Q3 {

    public static void updateWordFrequency(String text, HashMap<String, Integer> map) {
        String[] words = text.toLowerCase().split("\\W+");
        for (String w : words) {
            if (w.isEmpty()) continue;
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> freq = new HashMap<>();
        updateWordFrequency("Hello world hello", freq);
        updateWordFrequency("world of java", freq);

        System.out.println(freq);
    }
}