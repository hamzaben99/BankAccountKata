package org.example.account;

import java.util.Date;

public class Transaction {
    private Date date;
    private double amount;
    private double balance;

    public Transaction(double amount, double oldBalance) {
        this(new Date(), amount, oldBalance);

    }

    public Transaction(Date date, double amount, double oldBalance) {
        this.date = date;
        this.amount = amount;
        this.balance = oldBalance + amount;
    }

    public Date getDate() {
        return this.date;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
