// Create a method called "calculateAverage" that takes an array of integers as an argument and returns the average of the numbers in the array.

public class Q1 {

    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) return 0;
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        double avg = calculateAverage(nums);
        System.out.println("Average = " + avg);
    }
}