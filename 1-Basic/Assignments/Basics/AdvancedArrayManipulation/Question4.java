// 4. Write a program to rotate the elements of an array by a given number of positions.

public class Question4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        System.out.print("Original: ");
        for (int num : arr) System.out.print(num + " ");

        System.out.print("\nRotated: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i + k) % n] + " ");
        }
    }
}
