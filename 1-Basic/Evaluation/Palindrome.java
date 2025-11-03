
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String a=sc.nextLine();
        String rev="";
        for(int i=a.length()-1; i>=0; i--){
            rev+=a.charAt(i);
        }
        if(a.equalsIgnoreCase(rev)){
            System.out.println("String is Palindrome!");
        }else{
            System.out.println("String is Not Palindrome!");
        }
    }
}