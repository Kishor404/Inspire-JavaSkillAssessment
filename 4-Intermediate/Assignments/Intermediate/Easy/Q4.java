// Create a method called "findMax" that takes an array of integers as an argument and returns the largest number in the array.

public class Q4 {

    public static int findMax(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = nums[0];
        for (int n : nums) {
            if (n > max) max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 9, 5};
        System.out.println("Max = " + findMax(nums));
    }
}