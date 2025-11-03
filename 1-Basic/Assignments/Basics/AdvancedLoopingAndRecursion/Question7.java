// 7. Write a program to find the greatest common divisor (GCD) of two numbers using recursion.

public class Question7 {
    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
