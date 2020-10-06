package com.shinkson47.portfolio.labs.one.controlstructures;

import com.shinkson47.portfolio.Helper;

public class GradeMark {

    public static void main(String[] args) {
        final int mark = Helper.random.nextInt(100);

        final String grade =
                (mark <40) ? "fail" :
                        (mark >= 40 && mark < 59) ? "pass" :
                                (mark >= 60 && mark < 69) ? "merit" :
                                        (mark > 70) ? "distinction" :
                                                "Unknown Grade";

        Helper.show("By the powers of random chance invested in me, i deduce that you earned an " + grade + "!");
    }
}
