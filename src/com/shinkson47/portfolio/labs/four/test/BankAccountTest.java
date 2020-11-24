package com.shinkson47.portfolio.labs.four.test;

import org.junit.Test;
import com.shinkson47.dmulib.*;

import static junit.framework.TestCase.assertEquals;

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
public class BankAccountTest {
    @Test
    public void testNegativeWithdraw(){
        BankAccount account = new BankAccount("yeet", 100);
        account.withdraw(1000);
        assertEquals("Account with no overdraft is overdrawn", 100, account.getBalance());
    }
}
