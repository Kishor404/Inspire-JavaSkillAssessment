public class NestedControlStatementsExample{
    public static void main(String[] args){

        int age=20;
        if(age>=18){
            if(age<=25){
                System.out.println("Age between 18 to 25");
            }else if(age>25 && age<=30){
                System.out.println("Age between 26 to 30");
            }else{
                System.out.println("Age is > 30");
            }
        }else{
            System.out.println("Age is < 18");
        }
    }
}