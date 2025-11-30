// 5) Write a program that reads a CSV file line by line and stores the data into a HashMap with column name as a key and entries as value.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q5 {
    public static void main(String[] args) {
        String fileName = "data.csv";

        Map<String, List<String>> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String headerLine = br.readLine();
            if (headerLine == null) {
                System.out.println("Empty file");
                return;
            }

            String[] headers = headerLine.split(",");

            for (String h : headers) {
                map.put(h, new ArrayList<>());
            }

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (int i = 0; i < headers.length && i < values.length; i++) {
                    map.get(headers[i]).add(values[i]);
                }
            }

            for (String col : map.keySet()) {
                System.out.println(col + " -> " + map.get(col));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
