// 8. Write a program to print the index of the given element in an array.

//             Input : {1, 5, 3, 7}, 1

//             Output: 0

//             Input : {10, 22, 33, 25, 32, 54, 64, 1}, 100

//             Output: -1

import java.util.Scanner;

public class Exercise8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a List Of Number Separated by Space : ");
        String str=sc.nextLine();
        String[] strs=str.split(" ");
        int[] arr=new int[strs.length];
        for(int i=0; i<strs.length; i++){
            arr[i]=Integer.parseInt(strs[i]);
        }
        System.out.println("Enter the element to search : ");
        int n=sc.nextInt();
        int id=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                id=i;
                break;
            }
        }
        System.out.println("Index : "+id);
    }
}