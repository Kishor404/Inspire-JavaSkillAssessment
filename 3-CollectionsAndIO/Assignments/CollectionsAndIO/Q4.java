// 4) Write a program to get user input using IO classes.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String name = br.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
