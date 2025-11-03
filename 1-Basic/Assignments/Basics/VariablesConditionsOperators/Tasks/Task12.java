// 12. Write a program that takes a string as input and reverses the order of the characters in the string.


import java.util.Scanner;

public class Task12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev+=""+str.charAt(i);
        }
        System.out.println("The Reverse Of the String is : "+rev);
    }
}