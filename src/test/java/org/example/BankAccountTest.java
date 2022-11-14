package org.example;

import org.example.account.BankAccount;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
    private static BankAccount account;

    @Before
    public void initBankAccount() {
        account = new BankAccount();
    }

    @Test(expected = IllegalArgumentException.class)
    public void depositNegativeAmount() {
        account.deposit(-50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdrawalNegativeAmount() {
        account.withdrawal(-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdrawalAmountLessThanBalance() {
        account.withdrawal(10);
    }

    @Test
    public void getBalance() {
        Assert.assertEquals(0., account.getBalance(), 0.);

        account.deposit(50);
        Assert.assertEquals(50., account.getBalance(), 0.);

        account.withdrawal(30);
        Assert.assertEquals(20., account.getBalance(), 0.);

        account.withdrawal(8.5);
        Assert.assertEquals(11.5, account.getBalance(), 0.);

        account.withdrawal(11.5);
        Assert.assertEquals(0, account.getBalance(), 0.);
    }
}
