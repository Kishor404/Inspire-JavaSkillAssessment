// 3. Write a program to sort an array of integers in ascending and descending order.

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        Arrays.sort(arr);
        System.out.print("Ascending: ");
        for (int num : arr) System.out.print(num + " ");

        System.out.print("\nDescending: ");
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
    }
}
