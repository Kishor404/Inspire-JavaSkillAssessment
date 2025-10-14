public class MethodOverloadingExample{
    public static void main(String[] args){
        int x=5;
        int y=10;
        int z=4;
        double a=9.67;
        double b=18.23;

        System.out.println(sum(x,y));
        System.out.println(sum(a,b));
        System.out.println(sum(x,y,z));
        System.out.println(sum(3,4));
        System.out.println(sum(7.9,12.3));
    }
    public static int sum(int x,int y){
        System.out.println("Int Sum 2");
        return x+y;
    }
    public static double sum(double x, double y){
        System.out.println("Double Sum 2");
        return x+y;
    }
    public static int sum(int x, int y, int z){
        System.out.println("Int Sum 3");
        return x+y+z;
    }
}