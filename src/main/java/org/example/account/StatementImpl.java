package org.example.account;

import java.util.ArrayList;
import java.util.List;

public class StatementImpl implements Statement{
    private List<Transaction> transactions;

    public StatementImpl() {
        transactions = new ArrayList<Transaction>();
    }

    public void addTransaction(double amount) {
        double oldBalance = 0;
        if (!transactions.isEmpty())
            oldBalance = transactions.get(transactions.size() - 1).getBalance();
        if (amount < 0 && oldBalance + amount < 0)
            throw new IllegalArgumentException("The balance is less than the amount to withdrawal : " + amount);
        transactions.add(new Transaction(amount, oldBalance));
    }

    public double getBalance() {
        if (transactions.isEmpty())
            return 0.;
        return transactions.get(transactions.size() - 1).getBalance();
    }

    public String print() {
        StringBuilder sbStatement = new StringBuilder();
        sbStatement.append("Date | Amount | Balance |\n");
        for (Transaction transaction : transactions) {
            sbStatement.append(transaction.getDate()).append(" | ");
            sbStatement.append(transaction.getAmount()).append(" | ");
            sbStatement.append(transaction.getBalance()).append(" | ");
            sbStatement.append("\n");
        }
        return sbStatement.toString();
    }
}
