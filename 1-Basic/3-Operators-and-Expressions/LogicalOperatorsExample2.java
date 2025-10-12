public class LogicalOperatorsExample2{
    public static void main(String args[]){
        String username="JohnDoe";
        String password="password123";

        if(username.equals("JohnDoe") && password.equals("password123")){
            System.out.println("Login Sucessfull !!");
        }else{
            System.out.println("Login Failed !");
        }
    }
}