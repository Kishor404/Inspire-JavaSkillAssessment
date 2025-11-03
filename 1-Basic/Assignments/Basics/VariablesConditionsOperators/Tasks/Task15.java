// 15. Write a program that finds the largest and smallest numbers in an array of integers.


public class Task15{
    public static void main(String[] args){
        int[] arr={12,4,56,23,76,45};
        int min=arr[0];
        int max=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.println("The largest number in array is "+max);
        System.out.println("The smallest number in array is "+min);
    }
}