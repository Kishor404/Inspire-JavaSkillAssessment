public class LogicalOperatorsExample1{
    public static void main(String args[]){
        int x=5;
        int y=10;
        int z=15;

        if(x<y && y<z){
            System.out.println("Y is between X and Z");
        }
        if(x>y || y>z){
            System.out.println("Either X Greater than Y or Y Greater than Z");
        }
        if(!(x==y)){
            System.out.println("X is Not Equal To Y");
        }
    }
}