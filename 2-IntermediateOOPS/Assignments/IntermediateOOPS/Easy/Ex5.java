public class Ex3{
    public static int calculateFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        int n=5;
        int fact=calculateFactorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
}