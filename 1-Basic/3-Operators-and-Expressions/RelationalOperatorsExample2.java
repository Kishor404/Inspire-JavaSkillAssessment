public class RelationalOperatorsExample2{
    public static void main(String args[]){
        double customerSpend = 600.0;
        double discountThreshold = 500.0;
        double discountAmount = 0.10;

        if(customerSpend > discountThreshold){
            double discount = customerSpend * discountAmount;
            System.out.println("Discount : $"+discount);
        }else{
            System.out.println("You are not eligible for discount !");
        }
    }
}