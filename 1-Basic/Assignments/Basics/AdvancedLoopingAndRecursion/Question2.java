// 2. Write a program to find the Fibonacci sequence up to a given limit using looping.

public class Question2 {
    public static void main(String[] args) {
        int limit = 10;
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        while (a <= limit) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
