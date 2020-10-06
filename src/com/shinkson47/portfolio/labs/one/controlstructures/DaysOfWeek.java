package com.shinkson47.portfolio.labs.one.controlstructures;

import com.shinkson47.portfolio.Helper;

public class DaysOfWeek  {

    public static void main(String[] args) {
        final int day = Helper.random.nextInt(7);

        String outputDay;

        switch (day){
            case 1:
                outputDay = "Monday";
                break;
            case 2:
                outputDay = "Tuesday";
                break;
            case 3:
                outputDay = "Wednesday";
                break;
            case 4:
                outputDay = "Thursday";
                break;
            case 5:
                outputDay = "Friday";
                break;
            case 6:
                outputDay = "Saturday";
                break;
            case 7:
                outputDay = "Sunday";
                break;
            default:
                outputDay = day + "/7";
                Helper.show("What Day? How was this even possible?");
                throw new IllegalStateException("Invalid Day of Week");
        }

        String WeekHalf;

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                WeekHalf = "Week";
                break;
            case 6:
            case 7:
                WeekHalf = "Weekend";
                break;
            default:
                WeekHalf = ".. Actaully, that's not even in the week?";
                break;

        }

        Helper.show("Random day: " + outputDay + ", which is in the " + WeekHalf);

    }
}
