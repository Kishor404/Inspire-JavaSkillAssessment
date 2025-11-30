class BankAccount{
    private double balance;
    private String accNumber;
    private String accType;

    double getBalance(){
        return balance;
    }
    void setBalance(double balance){
        this.balance=balance;
    }

    String getAccNumber(){
        return accNumber;
    }
    void setAccNumber(String accNumber){
        this.accNumber=accNumber;
    }

    String getAccType(){
        return accType;
    }
    void setAccType(String accType){
        this.accType=accType;
    }
}

public class Ex2{
    public static void main(String[] args){
        BankAccount abc=new BankAccount();

        abc.setBalance(2726.80);
        abc.setAccNumber("RBI829729791");
        abc.setAccType("Savings");

        double balance=abc.getBalance();
        String accNumber=abc.getAccNumber();
        String accType=abc.getAccType();
        
        System.out.println("Balance : "+balance+"\nAccount Number : "+accNumber+"\nAccount Type : "+accType);
    }
}