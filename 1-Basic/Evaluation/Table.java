import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int num = sc.nextInt();

        System.out.println("\nMultiplication Table for " + num + ":\n");

        for (int i = 1; i <= num; i++) {
            System.out.println("Table of " + i + ":");
            
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " x " + i + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
