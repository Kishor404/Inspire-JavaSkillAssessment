// Write a program that reads a CSV file line by line and and stores the data into a HashMap with column name as a key and entries as value.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Q5 {
    public static void main(String[] args) {
        String fileName = "data.csv";
        HashMap<String, String[]> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String headerLine = br.readLine();
            if (headerLine == null) return;

            String[] headers = headerLine.split(",");

            String line;
            int rowIndex = 0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                map.put("Row" + rowIndex, values);
                rowIndex++;
            }

            for (String key : map.keySet()) {
                System.out.println(key + ":");
                String[] row = map.get(key);
                for (int i = 0; i < headers.length && i < row.length; i++) {
                    System.out.println("  " + headers[i] + " = " + row[i]);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}