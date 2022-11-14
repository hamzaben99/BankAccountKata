package org.example.account;

public class BankAccount {
    private Statement statement;
    public BankAccount() {
        this.statement = new StatementImpl();
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("The amount to deposit must be positive : " + amount);
        this.statement.addTransaction(amount);
    }

    public void withdrawal(double amount) {
        if (amount < 0) throw new IllegalArgumentException("The amount to withdrawal must be positive : " + amount);
        if (amount > this.statement.getBalance()) throw new IllegalArgumentException("The balance is less than the amount to withdrawal : " + amount);
        this.statement.addTransaction(-amount);
    }

    public double getBalance() {
        return this.statement.getBalance();
    }

    public void print() {
        System.out.println("||---------------------Bank account statement---------------------||");
        System.out.println("--------------------------------------------------------------------");
        System.out.println(this.statement.print());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Current Balance:  " + this.statement.getBalance());
        System.out.println("--------------------------------------------------------------------");
    }
}
