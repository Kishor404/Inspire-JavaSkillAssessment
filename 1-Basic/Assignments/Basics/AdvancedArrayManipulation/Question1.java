// 1. Write a program to find the second largest element in an array of integers.

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 65, 30};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second largest element: " + second);
    }
}
