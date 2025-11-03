// 2. Write a program to find the smallest and largest elements in an array of integers.

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {45, 12, 78, 3, 56};

        int smallest = arr[0], largest = arr[0];
        for (int num : arr) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
