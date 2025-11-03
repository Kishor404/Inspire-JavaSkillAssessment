// 6. Write a program to generate the first n prime numbers using looping.

public class Question6 {
    public static void main(String[] args) {
        int n = 10;
        int count = 0, num = 2;
        System.out.print("First " + n + " prime numbers: ");
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}
