
import java.time.Year;
import java.util.Scanner;

public class AgeCalculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age=sc.nextInt();
        System.out.println();
        int year=Year.now().getValue();
        int birthYear=year-age;
        System.out.println("You Born in "+birthYear);
    }
}