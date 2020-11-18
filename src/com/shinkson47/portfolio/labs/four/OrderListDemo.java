package com.shinkson47.portfolio.labs.four;

import com.shinkson47.portfolio.labs.five.lib.OrderLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

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
public class OrderListDemo extends ArrayList<OrderLine> {

    {
        this.addAll(Arrays.asList(
                new OrderLine("Milk", 100, 30),
                new OrderLine("Bread", 87, 203),
                new OrderLine("Mystery Meat", 500, 5),
                new OrderLine("Condoms", 700, 120)
        ));

        final AtomicInteger total = new AtomicInteger();

        forEach(l -> {
                    System.out.println(l);
                    total.addAndGet(l.getCost());
                }
                );
        int average = total.get() / this.size();

        final AtomicInteger newtotal = new AtomicInteger();
        this.stream().mapToInt(l ->
            newtotal.addAndGet(l.getCost())
        );
    }
}
