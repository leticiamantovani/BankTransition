package entities;

public class bank {
    private int account;
    private String name;
    private double balance;

    public bank(String name, int account) {
        this.name = name;
        this.account = account;
    }

    public bank(String name, int account, double balance) {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getaccount(){
    return account;
    }
    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }
    public void deposit(double value){
        balance += value;
    }
    public void withdrawn(double valuetwo){
        balance -= valuetwo + 5.0;
    }
    public String toString(){
        return "Account" + account + ", Holder: " + name + ", Balance: $" + String.format("%.2f", balance);
    }
}
