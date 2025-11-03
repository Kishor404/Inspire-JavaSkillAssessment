// 6. Write a program to remove all occurrences of a given character from input String.

//             Input : ABCabc, a Output: BCbc

//             Input : ABCabc, d Output: ABCabc

import java.util.Scanner;

public class Exercise6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();

        String st=str.split(", ")[0];
        String ch=str.split(", ")[1];

        String nstr="";

        for(int i=0; i<st.length(); i++){
            String x=st.charAt(i)+"";
            if(!x.equalsIgnoreCase(ch)){
                nstr+=x;
            }
        }
        System.out.println(nstr);
    }
}