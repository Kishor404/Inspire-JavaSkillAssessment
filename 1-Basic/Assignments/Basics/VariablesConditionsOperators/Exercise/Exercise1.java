//   1. Write a program to check if a vowel is present in the string.
//         Input: aAnt Output: true 
//         Input: Brklmn Output: false


import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();

        if(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")){
            System.out.println("Contain Vowels : True");
        }else{
            System.out.println("Contain Vowels : False");
        }
    }
}