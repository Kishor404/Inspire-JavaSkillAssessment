import java.util.*;

public class Ex2 {

    // Generate random array
    static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static long measureTime(Runnable sortFunction) {
        long start = System.nanoTime();
        sortFunction.run();
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] originalArray = generateRandomArray(size);

        int[] arr1 = Arrays.copyOf(originalArray, size);
        int[] arr2 = Arrays.copyOf(originalArray, size);
        int[] arr3 = Arrays.copyOf(originalArray, size);
        int[] arr4 = Arrays.copyOf(originalArray, size);

        System.out.println("\nSorting performance (in milliseconds):");

        long timeBubble = measureTime(() -> bubbleSort(arr1)) / 1_000_000;
        System.out.println("Bubble Sort: " + timeBubble + " ms");

        long timeSelection = measureTime(() -> selectionSort(arr2)) / 1_000_000;
        System.out.println("Selection Sort: " + timeSelection + " ms");

        long timeInsertion = measureTime(() -> insertionSort(arr3)) / 1_000_000;
        System.out.println("Insertion Sort: " + timeInsertion + " ms");

        long timeQuick = measureTime(() -> quickSort(arr4, 0, arr4.length - 1)) / 1_000_000;
        System.out.println("Quick Sort: " + timeQuick + " ms");
    }
}
