import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("\nFibonacci Series up to " + n + ":");
        System.out.print(a + " " + b + " ");

        int next = a + b;

        while (next <= n) {
            System.out.print(next + " ");
            a = b;
            b = next;
            next = a + b;
        }
    }
}
