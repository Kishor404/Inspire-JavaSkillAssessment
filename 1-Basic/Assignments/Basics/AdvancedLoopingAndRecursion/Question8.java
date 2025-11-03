// 8. Write a program to find the least common multiple (LCM) of two numbers using looping.

public class Question8 {
    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("LCM of " + a + " and " + b + " = " + lcm(a, b));
    }

    static int lcm(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0)
                return max;
            max++;
        }
    }
}
