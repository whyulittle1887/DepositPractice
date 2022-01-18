package com.example;

import java.util.Date;

public class TimeDepositAccount extends Account
{
    // Time related member
    private final Date maturityDate;

    // Time-related member
    public TimeDepositAccount(double balance, Date maturityDate)
    {
        super(balance);
        this.maturityDate = maturityDate;
    }

    @Override
    // Time-related member
    public boolean withdraw(double amount)
    {
        Date today = new Date();
        if(today.after(maturityDate))
        {
            if(amount <= balance)
            {
                balance -= amount;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    // Time-related member
    public String getDescription()
    {
        return "Time Deposit Account " + maturityDate;
    }
    
}