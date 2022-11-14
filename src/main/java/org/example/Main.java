package org.example;

import org.example.account.BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(120.65);
        account.deposit(1665.54);
        account.withdrawal(500.55);
        account.deposit(23.3);
        account.withdrawal(631.66);
        account.withdrawal(320.3);
        account.deposit(8360.21);
        account.withdrawal(3021.6);
        account.deposit(100);

        account.print();
    }
}
