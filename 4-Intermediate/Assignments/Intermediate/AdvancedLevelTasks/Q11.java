// Implement a recursive function in Java that calculates the n-th Fibonacci number. Test the function with different values of n.

public class Q11 {

    public static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }
    }
}