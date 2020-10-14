package com.shinkson47.portfolio.labs.two.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class SentenceProcessorAlternate {

	public static void main(String[] args) {
		String sentence = "";
		int words, vowels, letters;

		Character[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
		Set<Character> vowelSet = new HashSet<>(Arrays.asList(vowelArray));


		Scanner in = new Scanner(System.in);

		System.out.println("Type in a sentence...\n");

		sentence = in.nextLine();

		while (!sentence.equals("exit")) {

			words = sentence.trim().split(" +").length;

			vowels = 0;
			letters = 0;

			for (char c : sentence.toLowerCase().toCharArray()) {

				if (c >= 'a' && c <= 'z')
				{
					letters++;

					if (vowelSet.contains(c)) {
						vowels++;
					}

				}
			}

			System.out.println("Sentence: " + sentence);
			System.out.println("Number of words in sentence? " + words);
			System.out.println("Number of vowels in sentence? " + vowels);
			System.out.println("Number of letters in sentence? " + letters);
			System.out.printf("Percentage of letters that are vowels? %.2f%%\n\n", ((vowels / (float) letters) * 100));

			
			System.out.println("\nNext sentence...(type exit to stop)\n");
			
			sentence = in.nextLine();
		} 
		
		System.out.println("Program terminating...");
		
		in.close();

	}

}
