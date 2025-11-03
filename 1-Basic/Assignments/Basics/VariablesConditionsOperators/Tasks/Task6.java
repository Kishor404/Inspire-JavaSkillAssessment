// 6. Write a program that asks the user to enter a temperature in Celsius and converts it to Fahrenheit. The formula for converting Celsius to Fahrenheit is F = (C * 9/5) + 32.


import java.util.Scanner;

public class Task6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Celsius : ");
        int celsius=sc.nextInt();
        int fahrenheit=(celsius * 9/5)+32;
        System.out.println("The Temperature in Fahrenheit is "+fahrenheit+".");
    }
}