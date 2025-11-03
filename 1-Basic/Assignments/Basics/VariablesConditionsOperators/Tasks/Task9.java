// 9. Create a program that asks the user to enter a string and then checks whether the string contains the word "Java". If it does, print out "The string contains Java." If it doesn't, print out "The string does not contain Java."


import java.util.Scanner;

public class Task9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        if(str.contains("Java")){
            System.out.println("The string contains Java.");
        }else{
            System.out.println("The string does not contain Java.");
        }
    }
}