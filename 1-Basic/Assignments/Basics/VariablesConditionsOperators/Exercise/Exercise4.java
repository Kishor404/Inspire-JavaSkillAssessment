//  4. Write a program to generate Fibonacci series up to given number 'n'. 

import java.util.Scanner;

public class Exercise4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();

        int i=0;
        int j=1;
        do { 
            System.out.print(i+" ");
            int temp=i;
            i=j;
            j=temp+i;
            n--;
        } while (n>0);
    }
}