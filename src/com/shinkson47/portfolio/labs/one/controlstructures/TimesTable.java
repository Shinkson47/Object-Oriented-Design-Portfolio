package com.shinkson47.portfolio.labs.one.controlstructures;

/**
 * Simple executable class that prints out a times table up to the bounds of
 * 12*12
 *
 * @author Jordan Gray
 */
public class TimesTable {


	/**
	 * Prints a 12*12 times table.
	 */
	private static void printTable(){
		int size = 12;

		String line = "\t";
		for (int i = 1; i<=size; i++){
			line += i + "\t";
		}
		System.out.println(line + "\n");


		for (int i = 1; i<=size; i++){
			line = "";
			for (int j = 1; j<=size; j++){
				line += (i*j) + "\t";
			}
			System.out.println(i + " : " + line + "\n");
		}
	}

	public static void main(String[] args) {
		printTable();
	}
}

