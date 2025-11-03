// 17. Write a program that generates a multiplication table for a given number.


import java.util.Scanner;

public class Task17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i+" * "+num+" = "+(i*num));
        }
    }
}