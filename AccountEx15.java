//Ex 15
package company;

public class AccountEx15 {
    private String name;
    private double balance;
    double depositamount;
    double withdrawamount;
    public AccountEx15(String name, double balance) {
        this.name = name;
        if(balance > 0.0)
            this.balance = balance;
    }
    public void deposit(double depositamount){
        if(depositamount > 0.0)
            balance += depositamount;
    }
    public void withdraw(double withdrawamount){
        if(withdrawamount > 0.0)
            balance -= withdrawamount;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
}