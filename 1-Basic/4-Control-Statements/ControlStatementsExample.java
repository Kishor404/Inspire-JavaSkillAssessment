import java.util.Scanner;

public class ControlStatementsExample{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Num1 : ");
        int num1=sc.nextInt();

        if(num1%2==0){
            System.out.println(num1+" is Even Number.");
        }else{
            System.out.println(num1+" is Odd Number.");
        }

        System.out.println("Enter Num2 : ");
        int num2=sc.nextInt();

        for(int i=1; i<=num2; i++){
            System.out.println(i);
        }

        int sum=0;
        int j=1;
        while(j<=num2){
            sum+=j;
            j++;
        }
        System.out.println("Sum of First "+num2+" Natural Number is "+sum+".");
    }
}