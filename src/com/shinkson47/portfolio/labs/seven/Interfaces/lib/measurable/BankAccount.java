package com.shinkson47.portfolio.labs.seven.Interfaces.lib.measurable;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/10/2020</a>
 * @version 1
 * @since v1
 */
public abstract class BankAccount implements Measurable {

    private int Balance;

    @Override
    public int getMeasure() {
        return getBalance();
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}
