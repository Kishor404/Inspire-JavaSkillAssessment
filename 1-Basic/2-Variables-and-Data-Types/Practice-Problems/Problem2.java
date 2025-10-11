import java.util.*;

public class Problem2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Products : ");
        int n=sc.nextInt();
        double price[] = new double[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter Price Of Product "+(i+1)+" : ");
            double p=sc.nextDouble();
            price[i]=p;
        }
        double totalPrice=0;
        for(int j=0; j<n; j++){
            totalPrice+=price[j];
        }
        System.out.println("The Total Price is "+totalPrice);
    }
}