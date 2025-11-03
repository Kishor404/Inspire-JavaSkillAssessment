
import java.util.Scanner;

public class UnitConvention{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length in Meter : ");
        double m=sc.nextDouble();
        double feet=m*3.28084;
        double cm=m*100;
        double inch=m*39.3701;
        System.out.printf("Feet : %.2f ft\n",feet);
        System.out.printf("Inches : %.2f inch\n",inch);
        System.out.printf("Centimeters : %.2f cm\n",cm);

    }
}