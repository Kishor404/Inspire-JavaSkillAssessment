// Create a class called "BankAccount" with properties such as "balance", "accountNumber", and "accountType". Implement the necessary getter and setter methods for each property.

class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountType;

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
}

public class Q2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountNumber("12345");
        acc.setAccountType("Savings");
        acc.setBalance(1000.0);

        System.out.println("Acc No: " + acc.getAccountNumber());
        System.out.println("Type : " + acc.getAccountType());
        System.out.println("Balance: " + acc.getBalance());
    }
}