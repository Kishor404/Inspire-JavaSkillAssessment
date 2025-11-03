// 2. Write a program to find third largest number in an array.

//    Input: {10, 5, 11, 100, 15, 12, 13}     Output: 13

//    Input: {0, 1}                           Output: -1

//    Input: {1, 1, 1, 1}                     Output: 1


import java.util.Arrays;
import java.util.Scanner;

public class Exercise2{

    public static int thridLargest(int[] nums){
        Arrays.sort(nums);
        if(nums.length<3){
            return -1;
        }
        return nums[nums.length-3];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a List Of Number Separated by Space : ");
        String str=sc.nextLine();
        String[] strs=str.split(" ");
        int[] nums=new int[strs.length];
        for(int i=0; i<strs.length; i++){
            nums[i]=Integer.parseInt(strs[i]);
        }
        System.out.println("The Third Largest is "+thridLargest(nums));
        
    }
}