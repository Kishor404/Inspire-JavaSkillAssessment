//   3. Write a program to find out if the given string (ignore the spaces in the string) is palindrome or not.

//         Input: abBa Output: true

//         Input: a     b  cba Output: true

//         Input: ab Output: false


import java.util.Scanner;

public class Exercise3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();

        String nstr=str.replaceAll(" ", "");

        String rev="";
        for(int i=nstr.length()-1; i>=0; i--){
            rev+=""+nstr.charAt(i);
        }
        if(nstr.equalsIgnoreCase(rev)){
            System.out.println("Palindrome : True");
        }else{
            System.out.println("Palindrome : False");
        }
    }
}