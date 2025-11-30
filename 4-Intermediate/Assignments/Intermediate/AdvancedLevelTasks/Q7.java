// Create a Java program that reads a CSV file using FileReader and stores the data into a HashSet. Implement a method that takes a string as input and searches the HashSet for matching entries. Display the results.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        String fileName = "data.csv";
        HashSet<String> set = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                set.add(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search text: ");
        String query = sc.nextLine();
        sc.close();

        boolean found = false;
        for (String entry : set) {
            if (entry.contains(query)) {
                System.out.println("Found: " + entry);
                found = true;
            }
        }
        if (!found) System.out.println("No match found.");
    }
}