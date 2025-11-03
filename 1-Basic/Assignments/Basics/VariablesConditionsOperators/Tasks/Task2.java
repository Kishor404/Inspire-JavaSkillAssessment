// 2. Create a program that asks the user for their name and then greets them by name.

import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name=sc.nextLine();
        System.out.println("Hello! "+name);
    }
}