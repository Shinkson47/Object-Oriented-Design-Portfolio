package com.shinkson47.portfolio.labs.five.main;

import java.util.ArrayList;

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
public class StringListDemo {
    public final static ArrayList<String> list = createList();

    static ArrayList<String> createList() {
        final ArrayList<String> list = new ArrayList<>();
        list.add("Jeremy");
        list.set(0, "Not Jeremy");
        return list;
    }

    static {
        for (String s : list)
            System.out.println(s.toUpperCase());

        list.forEach(s ->
                System.out.println(s.toLowerCase())
                );
    }

}
