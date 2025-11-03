// 4. Write a program that asks the user to enter a number and then prints out whether the number is positive, negative, or zero.


import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println(num+" is Positive Number.");
        }else if(num<0){
            System.out.println(num+" is Negative Number.");
        }else{
            System.out.println("The num is 0");
        }
    }
}