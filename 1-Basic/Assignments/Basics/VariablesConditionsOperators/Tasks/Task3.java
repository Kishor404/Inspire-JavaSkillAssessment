// 3. Declare two variables of type int called num1 and num2. Assign them values of your choice. Write a program that compares num1 and num2 and prints out whether num1 is greater than, less than, or equal to num2.

public class Task3{
    public static void main(String[] args){
        int num1=10;
        int num2=15;
        if(num1>num2){
            System.out.println(num1+" is Greater than "+num2+".");
        }else if(num1<num2){
            System.out.println(num2+" is Greater than "+num1+".");
        }else{
            System.out.println("Both are equal.");
        }
    }
}