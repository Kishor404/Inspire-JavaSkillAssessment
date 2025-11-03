// 3. Write a program to find the average of all the elements in an array of doubles.

public class Task3 {
    public static void main(String[] args) {
        double[] arr = {10.5, 20.0, 30.5, 40.0, 50.0};
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / arr.length;
        System.out.println("Average of elements: " + average);
    }
}
