package com.example;

public class CheckingAccount extends Account
{
    private final double OVERDRAFT_LIMIT;

    public CheckingAccount(double balance)
    {
        this(balance, 0);
    }

    public CheckingAccount(double balance, double overdraftLimit)
    {
        super(balance);
        this.OVERDRAFT_LIMIT = overdraftLimit;
    }

    @Override
    public String getDescription()
    {
        return "Checking Account";
    }

    @Override
    public boolean withdraw(double amount)
    {
        if(amount <= balance + OVERDRAFT_LIMIT)
        {
            balance -= amount;
            return true;
        }
        else
        {
            return false;
        }
    }
}
