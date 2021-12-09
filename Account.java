//Ex 11
package company;

public class Account {
    private double balance;

    // constructor
    public Account(double initialBalance){

        if(initialBalance > 0.0)
            balance = initialBalance;
    }

    public void credit(double amount){
        balance += amount;
    }
    public boolean debit(double amount){
        // ensure sufficient funds
        if(amount > balance)
            return false;

        balance -= amount;
        return true;
    }
    public double getBalance(){
        return balance;
    }
}