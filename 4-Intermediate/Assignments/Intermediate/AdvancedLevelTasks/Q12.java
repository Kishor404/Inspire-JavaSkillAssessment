// Create a multithreaded Java program that performs a set of computations on a large dataset. Use parallel processing to speed up the computations and compare the performance with the single-threaded version.

import java.util.Random;

class SumTask implements Runnable {
    private int[] arr;
    private int start, end;
    public long result;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr; this.start = start; this.end = end;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        result = sum;
    }
}

public class Q12 {

    private static int[] randomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = r.nextInt(100);
        return arr;
    }

    public static void main(String[] args) throws InterruptedException {
        int size = 1_000_000;
        int[] data = randomArray(size);

        long start = System.currentTimeMillis();
        long sum = 0;
        for (int v : data) sum += v;
        long end = System.currentTimeMillis();
        System.out.println("Single-threaded sum = " + sum + " time = " + (end - start) + " ms");

        int mid = size / 2;
        SumTask t1 = new SumTask(data, 0, mid);
        SumTask t2 = new SumTask(data, mid, size);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        long total = t1.result + t2.result;
        end = System.currentTimeMillis();

        System.out.println("Multi-threaded sum = " + total + " time = " + (end - start) + " ms");
    }
}