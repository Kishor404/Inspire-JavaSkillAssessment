// 5. Write a program to find the common elements between two arrays of integers.

public class Question5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 6, 7};
        int[] arr2 = {3, 5, 7, 9};

        System.out.print("Common elements: ");
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                    break;
                }
            }
        }
    }
}
