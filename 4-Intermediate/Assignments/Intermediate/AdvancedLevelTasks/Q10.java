// Create a Java program that generates a random sequence of numbers and sorts them using Bubble Sort, Selection Sort, Insertion Sort, and Quick Sort algorithms. Compare their performance for large data sets.

import java.util.Arrays;
import java.util.Random;

public class Q10 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex]) minIndex = j;
            int t = arr[i]; arr[i] = arr[minIndex]; arr[minIndex] = t;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
            }
        }
        int t = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = t;
        return i + 1;
    }

    private static int[] randomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = r.nextInt(100000);
        return arr;
    }

    public static void main(String[] args) {
        int size = 5000;

        int[] arr1 = randomArray(size);
        int[] arr2 = Arrays.copyOf(arr1, size);
        int[] arr3 = Arrays.copyOf(arr1, size);
        int[] arr4 = Arrays.copyOf(arr1, size);

        long start, end;

        start = System.currentTimeMillis();
        bubbleSort(arr1);
        end = System.currentTimeMillis();
        System.out.println("Bubble sort: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        selectionSort(arr2);
        end = System.currentTimeMillis();
        System.out.println("Selection sort: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        insertionSort(arr3);
        end = System.currentTimeMillis();
        System.out.println("Insertion sort: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        quickSort(arr4, 0, arr4.length - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick sort: " + (end - start) + " ms");
    }
}