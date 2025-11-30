// Implement a binary search algorithm in Java to search for an element in an array.

import java.util.Arrays;

public class Q6 {

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 9, 12};
        System.out.println(Arrays.toString(arr));
        int index = binarySearch(arr, 7);
        System.out.println("Index of 7 = " + index);
    }
}