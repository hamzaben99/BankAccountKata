package org.example;

import org.example.account.Statement;
import org.example.account.StatementImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class StatementTest {
    private Statement statement;

    @Before
    public void initStatement() {
        statement = new StatementImpl();
    }

    @Test
    public void BalanceOfEmptyStatement() {
        Assert.assertEquals(0., statement.getBalance(), 0.);
    }

    @Test
    public void BalanceAfterOneTransaction() {
        statement.addTransaction(50.);
        Assert.assertEquals(50., statement.getBalance(), 0.);
    }

    @Test
    public void BalanceAfterManyTransactions() {
        statement.addTransaction(233);
        statement.addTransaction(500);
        statement.addTransaction(-200);
        statement.addTransaction(-33);
        statement.addTransaction(20);
        statement.addTransaction(-270);
        Assert.assertEquals(250, statement.getBalance(), 0.);
    }

    @Test(expected = IllegalArgumentException.class)
    public void NegativeTransactionValueLeadsToNegativeBalance() {
        statement.addTransaction(300);
        statement.addTransaction(-500);
    }
}
