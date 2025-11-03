
import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius Of Circle : ");
        double r=sc.nextDouble();
        double area=Math.PI*r*r;
        System.out.printf("The Area Of Circle is %.2f",area);
    }
}