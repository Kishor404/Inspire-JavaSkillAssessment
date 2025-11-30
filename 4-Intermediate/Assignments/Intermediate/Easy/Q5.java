// Create a method called "calculateFactorial" that takes an integer as an argument and returns the factorial of the number.

public class Q5 {

    public static long calculateFactorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("5! = " + calculateFactorial(5));
    }
}