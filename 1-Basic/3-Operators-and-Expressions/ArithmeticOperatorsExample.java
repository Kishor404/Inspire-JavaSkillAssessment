public class ArithmeticOperatorsExample{
    public static void main(String[] args) {
        double item1price = 16.99;
        int item1Quantity = 10;   
        double item2price = 12.99;
        int item2Quantity = 14;

        double subTotal = (item1price * item1Quantity) + (item2price * item2Quantity);
        double taxRate = 0.07;
        double taxAmount = subTotal * taxRate;
        double total = subTotal + taxAmount;

        System.out.println("Sub Total : $"+subTotal);
        System.out.println("Tax Amount : $"+taxAmount);
        System.out.println("Total : $"+total);   
    }
}