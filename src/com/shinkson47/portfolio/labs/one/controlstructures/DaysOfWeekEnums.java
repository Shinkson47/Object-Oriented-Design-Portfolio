package com.shinkson47.portfolio.labs.one.controlstructures;


public class DaysOfWeekEnums {

	public static void main(String[] args) {
		Day day = Day.MONDAY;

		switch (day) {
			case MONDAY :
			case TUESDAY :
			case WEDNESDAY :
			case THURSDAY :
			case FRIDAY : System.out.println("Weekday"); break;
			case SATURDAY :
			case SUNDAY : System.out.println("Weekend"); break;
			default : System.out.println("Unknown day"); break;
		}
	}

	public enum Day {
	    MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY, SUNDAY 
	}
}
