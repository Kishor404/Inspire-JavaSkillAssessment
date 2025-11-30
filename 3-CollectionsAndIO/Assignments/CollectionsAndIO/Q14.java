// 14) Create a Java program that reads a CSV file using FileReader and stores the data into a HashSet. Implement a method that takes a string as input and searches the HashSet for matching entries. Display the results.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q14 {
    public static void main(String[] args) {
        String fileName = "data.csv";
        Set<String> dataSet = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                dataSet.add(line); // store whole line
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search text: ");
        String query = sc.nextLine();
        sc.close();

        search(dataSet, query);
    }

    public static void search(Set<String> set, String text) {
        System.out.println("Matching entries:");
        for (String entry : set) {
            if (entry.contains(text)) {
                System.out.println(entry);
            }
        }
    }
}
