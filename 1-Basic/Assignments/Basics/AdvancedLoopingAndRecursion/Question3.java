// 3. Write a program to check if a given number is a prime number using recursion.

public class Question3 {
    public static void main(String[] args) {
        int num = 17;
        if (isPrime(num, 2))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2);
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }
}
