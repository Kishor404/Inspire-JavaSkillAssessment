
import java.util.Scanner;

public class CompundInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        int p=sc.nextInt();
        System.out.println();
        System.out.print("Enter Interest Rate : ");
        int r=sc.nextInt();
        System.out.println();
        System.out.print("Enter Number Of Years : ");
        int t=sc.nextInt();
        System.out.println();
        double a=p*(Math.pow((1+(r/100.0)), t));
        double ci=a-p;
        System.out.printf("Compound Interest : %.2f",ci);
    }
}