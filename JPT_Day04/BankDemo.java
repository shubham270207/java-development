package JPT_Day04;

class BankAccount{
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount>0){
            balance += amount;
        }
    }

    void displayBalance(){
        System.out.println(accountHolder + ":" + balance);
    }
}

public class BankDemo {
    public static void main(String arg[]){
        BankAccount account = new BankAccount("Shubham", 1000);
        account.deposit(500);
        account.displayBalance();
    }
}
