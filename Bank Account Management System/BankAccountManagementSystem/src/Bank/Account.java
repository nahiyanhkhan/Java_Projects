package Bank;

import javax.swing.JOptionPane;

public class Account {
    private int accountId;
    private String username;
    private String accountHolder;
    private String address;
    private String dob;
    private String gender;
    private double balance;

    //int accountId, String username, String accountHolder, String address, String dob, String gender, double balance
    public Account() {}
    
    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount){
        if((this.balance-amount) >= 500){
            this.balance -= amount;
        }
        else{
            JOptionPane.showMessageDialog(null, "Account balance can't be less than 500 BDT!");
        }
    }
    
    public void transfer(Account a,double amount){
        if((this.balance-amount) >= 500){
            this.withdraw(amount);
            a.deposit(amount);
        }
        else{
            JOptionPane.showMessageDialog(null, "Account balance can't be less than 500 BDT!");
        }
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
