// 18) Write a Java program that reads a file using BufferedReader and stores the data into an ArrayList. Use Iterator to traverse the list and display the content.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q18{
    public static void main(String[] args) {
        String fileName = "input.txt";
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        Iterator<String> it = lines.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
