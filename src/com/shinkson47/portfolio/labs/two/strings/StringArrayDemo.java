package com.shinkson47.portfolio.labs.two.strings;

/**
 * String arrays, ennit.
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray</a>
 * @version 1
 */
public class StringArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 7, 3};
        String[] fruit = {"Banan",
                "Apel",
                "Wow, that's grape",
                "Mangus",
                "Strawbs",
                "Norbs",
                "WOW, GRAPE"};

        for (String str : fruit){
            System.out.println(str);
        }
    }
}
