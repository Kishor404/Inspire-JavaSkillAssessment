// Write a program that reads a text file and counts the number of occurrences of each word in the file. The program should display the results in alphabetical order.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Q3 {
    public static void main(String[] args) {
        String fileName = "input.txt";
        Map<String, Integer> wordCount = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String w : words) {
                    if (w.isEmpty()) continue;
                    wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}