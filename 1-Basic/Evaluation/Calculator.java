
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("|   SIMPLE CALCULATOR   |\n");
        while (true) { 
            System.out.println("1. Addition\n2. Subraction\n3. Division\n4. Multiplication\n5. Exit\n");
            System.out.print("Enter Options To Perform Operations : ");
            int in=sc.nextInt();
            System.out.println();
            int res;
            if(in==1){
                System.out.print("Enter a : ");
                int a=sc.nextInt();
                System.out.println();
                System.out.print("Enter b : ");
                int b=sc.nextInt();
                System.out.println();
                res=a+b;
            }else if(in==2){
                System.out.print("Enter a : ");
                int a=sc.nextInt();
                System.out.println();
                System.out.print("Enter b : ");
                int b=sc.nextInt();
                System.out.println();
                res=a-b;
            }else if(in==3){
                System.out.print("Enter a : ");
                int a=sc.nextInt();
                System.out.println();
                System.out.print("Enter b : ");
                int b=sc.nextInt();
                System.out.println();
                res=a/b;
            }else if(in==4){
                System.out.print("Enter a : ");
                int a=sc.nextInt();
                System.out.println();
                System.out.print("Enter b : ");
                int b=sc.nextInt();
                System.out.println();
                res=a*b;
            }else{
                break;
            }
            System.out.println("Result : "+res);
            System.out.println();
        }
    }
}