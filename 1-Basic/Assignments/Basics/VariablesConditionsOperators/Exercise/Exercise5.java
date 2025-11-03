//  5. Write a program to sort the elements in odd positions in descending order and elements in even positions in ascending order

//             Input : {13, 2, 4, 15, 12, 10, 5}

//             Output: {13, 2, 12, 10, 5, 15, 4}

//             Input : {1, 2, 3, 4, 5, 6, 7, 8, 9}

//             Output: {9, 2, 7, 4, 5, 6, 3, 8, 1}

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a List Of Number Separated by Space : ");
        String str=sc.nextLine();
        String[] strs=str.split(" ");
        int[] nums=new int[strs.length];
        for(int i=0; i<strs.length; i++){
            nums[i]=Integer.parseInt(strs[i]);
        }
        Arrays.sort(nums);
        int[] res=new int[strs.length];
        for(int i=0; i<nums.length; i++){
            if((i+1)%2==0){
                res[i]=nums[i];
            }else{
                res[i]=nums[nums.length-1-i];
            }
        }
        for(int i:res){
            System.out.print(i+" ");
        }
        
    }
}