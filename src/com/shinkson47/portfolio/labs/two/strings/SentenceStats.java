package com.shinkson47.portfolio.labs.two.strings;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Executable.
 *
 * Reads a sentence via the console, and provides statistics about it's contents.
 *
 * I didn't have enough time to populate all javadocs.
 * @version 1
 * @author <a href="http://www.shinkson47.in">Jordan T. Gray</a>
 */
public class SentenceStats {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence = readString();
        String[] words = getWords(sentence);

        print("Word count: "+ words.length);
        short vowelCount = vowelCount(sentence);
        print("Vowel count: " + vowelCount);
        print("Vowel percent: " + toPercent(vowelCount, StripWS(sentence).length()) + "%");
    }

    private static String StripWS(String sentence) {
        return sentence.replace(" ", "");
    }

    private static int toPercent(double vowelCount, double length) {
        return (int) (((length / 100.0) * vowelCount) * 100.0);
    }

    private static String[] getWords(String sentence) {
        return sentence.trim().split(" ");
    }

    public static String readString(){
        return scanner.nextLine();
    }

    private static void print(String line){
        System.out.println(line);
    }

    public static short vowelCount(String i){
        short vowelCount = 0;
        for(int currentChar = 0; currentChar <= i.length()-1; currentChar++){
            if (isVowel(i.charAt(currentChar)))
                vowelCount++;
        }
        return vowelCount;
    }

    private static final ArrayList<Character> vowels = new ArrayList<Character>(List.from(new Character[]{'a', 'e', 'i', 'o', 'u'}));
    public static boolean isVowel(char c){
        return vowels.contains(c);
    }
}
