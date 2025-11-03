// 5. Write a program to print the first 10 numbers of the Fibonacci sequence.

public class Task5 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;

        System.out.print("First 10 Fibonacci numbers: ");
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < 10; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
