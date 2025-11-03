// 14. Implement a program that determines whether a given string is a palindrome (i.e., it reads the same forwards and backwards).


import java.util.Scanner;

public class Task14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev+=""+str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev)){
            System.out.println("The String is Palindrome.");
        }else{
            System.out.println("The String is not Palindrome.");
        }
    }
}