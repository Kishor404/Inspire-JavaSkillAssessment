class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Example1{
    public static void main(String[] args){
        BankAccount myAccount=new BankAccount();
        //System.out.println(myAccount.balance);
        myAccount.deposit(200);
        myAccount.withdraw(167);
        myAccount.withdraw(160);
        System.out.println(myAccount.getBalance());
    }
}