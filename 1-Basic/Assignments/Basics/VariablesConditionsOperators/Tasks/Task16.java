// 16. Create a program that reads in a list of names from the user and then sorts them in alphabetical order.


import java.util.Arrays;
import java.util.Scanner;

public class Task16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numer of names : ");
        int n=sc.nextInt();
        Scanner scn=new Scanner(System.in);
        String[] names=new String[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter Name "+(i+1)+" : ");
            names[i]=scn.nextLine();
        }
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}