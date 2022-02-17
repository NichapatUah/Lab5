package lab5;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12) / 100;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public double withdraw(double withdraw){
        return balance = balance - withdraw;
    }

    public double deposit(double deposit){
        return balance = balance + deposit;
    }
}

