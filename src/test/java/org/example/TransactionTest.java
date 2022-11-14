package org.example;

import org.example.account.Transaction;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class TransactionTest {
    @Test
    public void defaultDate() {
        Date date = new Date();
        Transaction transaction = new Transaction(1,0);
        Assert.assertEquals(date.getTime(), transaction.getDate().getTime());
    }

    @Test
    public void customDate() {
        Date date = new Date();
        Transaction transaction = new Transaction(date, 1, 0);
        Assert.assertEquals(date.getTime(), transaction.getDate().getTime());
    }

    @Test
    public void amountOfTransaction() {
        Transaction transaction = new Transaction(320., 0);
        Assert.assertEquals(320., transaction.getAmount(), 0.);

        transaction = new Transaction(623.33, 120.);
        Assert.assertEquals(623.33, transaction.getAmount(), 0.);
    }

    @Test
    public void balanceOfTransaction() {
        Transaction transaction = new Transaction(0., 55.35);
        Assert.assertEquals(55.35, transaction.getBalance(), 0.);

        transaction = new Transaction(65.3, 40);
        Assert.assertEquals(105.3, transaction.getBalance(), 0.);
    }
}
