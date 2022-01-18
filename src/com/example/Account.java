package com.example;

import java.util.Date;

public abstract class Account
{
    // Any account type member
    protected double balance;

    public Account(double balance)
    {
        this.balance = balance;
    }

    // Any account type member
    public double getBalance()
    {
        return balance;
    }

    // Any account type member
    public void deposit(double amount)
    {
        balance += amount;
    }

    // Any account type member
    @Override
    public String toString()
    {
        return getDescription() + ": current balance is " + balance;
    }

    public abstract String getDescription();

    public abstract boolean withdraw(double amount);
}
