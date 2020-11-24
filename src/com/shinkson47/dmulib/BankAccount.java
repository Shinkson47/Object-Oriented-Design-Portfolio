package com.shinkson47.dmulib;

/**
 * <h1>A single person's bank account</h1>
 * <br>
 * <p>
 * With the ability to withdraw and deposit a value, with no overdraft.
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/10/2020</a>
 * @version 1
 * @since v1
 */
public class BankAccount {

    //#region fields
    private String accountNo;
    private int balance;
    //#endregion

    //#region constructor

    /**
     * Creates a new Account with no name or balannce.
     */
    public BankAccount() {
        this("", 0);
    }

    public BankAccount(String accountNo) {
        this(accountNo, 0);
    }

    public BankAccount(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    //#endregion

    //#region methods

    /**
     * @return in pence, the current available balance.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Adds the specified quantity of funds to the account's balance.
     * @param quantity quantity, in pence, of funds to add.
     */
    public void deposit(int quantity) {
        this.balance += balance;
    }

    /**
     * Deducts a specified quantity of funds from the account's balance.
     * <br>
     * <p>If the quantity to remove is greater than the available balance, this has no effect.</p>
     * @param quantity quantity, in pence, of funds to deduct.
     */
    public void withdraw(int quantity) {
        balance -= (quantity > balance) ? 0 : quantity;
    }
    //#endregion
}
