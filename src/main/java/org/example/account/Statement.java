package org.example.account;

public interface Statement {
    public void addTransaction(double amount);

    public double getBalance();

    public String print();
}
