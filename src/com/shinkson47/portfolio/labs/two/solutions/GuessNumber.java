package scanner;

import java.util.Scanner;


public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=9, guess, count=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Guess a number!");
			guess = sc.nextInt();
			
			
			if (guess > target) {
				System.out.println("Please go lower");
			}
			else if (guess < target) {
				System.out.println("Please go higher");
			}
			else {
				System.out.println("Congratulations, you guessed the target number.");
			}
			
			count++;
			
			
		} while (guess != target);
		
		
		System.out.println("You took " + count + " attempts to find the target");
		
		sc.close();
	}

}
