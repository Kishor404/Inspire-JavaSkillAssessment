// 13. Create a program that reads in a list of numbers from the user and then calculates the average of those numbers.


import java.util.Scanner;

public class Task13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a List Of Number Separated by Space : ");
        String str=sc.nextLine();
        String[] strs=str.split(" ");
        int sum=0;
        for(String i:strs){
            sum+=Integer.parseInt(i);
        }
        int avg=sum/strs.length;
        System.out.println("The Average Of The List Of Numbers is : "+avg);
    }
}