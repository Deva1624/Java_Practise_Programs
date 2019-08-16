import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double air = 0;
    private Date createdate = new Date();

    public void setId(int account_id) {
        this.id = account_id;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAir(double annual_interest_rate) {
        this.air = annual_interest_rate;
    }

    public double getAir() {
        return this.air;
    }

    public Date getDate() {
        return this.createdate;
    }

    public void Account(int id, double balance, double air) {
        int acc_id = id;
        double bal = balance;
        double ar = air;
        System.out.println("AC Numer: " + acc_id);
        System.out.println("AC Balance: " + bal);
        System.out.println("Annual Interest Rate: " + ar);
    }

    public void Account() {
        System.out.println("Account number: " + 1234);
        System.out.println("Account Balance: " + 10000);
        System.out.println("Annual Interest Rate: " + 1.0);
    }

    public void withdraw(int amt) {
        double amount = balance - amt;
        System.out.println("Avail Balance: " + amount);
    }

    public void Deposit(int amt) {
        double amount = balance + amt;
        System.out.println("Avail Balance: " + amount);
    }

    public static void main(String[] args) {
        Account ac = new Account();
        ac.setId(23344556);
        ac.setBalance(10752.23);
        ac.setAir(1.5);
        ac.Account(ac.getId(), ac.balance, ac.getAir());
        // ac.Account();
        ac.withdraw(1000);
        ac.Deposit(20000);

    }
}