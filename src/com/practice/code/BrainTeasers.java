package com.practice.code;

import java.util.HashMap;
import java.util.Map;

/**
 * Brain teaser class for practicing.
 * 
 * @author Brian Jensen
 * Date: 09/15/2017
 */
public class BrainTeasers {
	public static String FIZZ = "fizz";
	public static String BUZZ = "buzz";
	public static String FIZZBUZZ = FIZZ + BUZZ;

	/**
	 * Print word Fizz if divisible by 3
	 * Print word Buzz if divisible by 5
	 * Print word FizzBuzz if divisible by 3 and 5
	 * 
	 * Note: The working version after talking it out during the interview.
	 * 
	 * @param n The number of to count from 1 to n
	 * @return The map will contain the number as the key and the value is the word.
	 */
	public static Map<Integer, String> fizzBuzz2(int n) {
		Map<Integer, String> result = new HashMap<>();
		for (int i = 1; i < n; i++) {
			if (((i % 3) == 0) && ((i % 5) == 0)) {
				result.put(i, FIZZBUZZ);
				System.out.println(String.format("%d %s", i, FIZZBUZZ));
			} else if ((i % 3) == 0) {
				result.put(i, FIZZ);
				System.out.println(String.format("%d %s", i, FIZZ));
			} else if ((i % 5) == 0) {
				result.put(i, BUZZ);
				System.out.println(String.format("%d %s", i, BUZZ));
			} else {
				System.out.println(i);
			}
		}
		return result;
	}
	
	/**
	 * Print word Fizz if divisible by 3
	 * Print word Buzz if divisible by 5
	 * Print word FizzBuzz if divisible by 3 and 5
	 * 
	 * Note: This is the first version I wrote that was not correct because it would never get to FizzBuzz.
	 * 
	 * @param n The number of to count from 1 to n
	 * @return The map will contain the number as the key and the value is the word.
	 */
	public static Map<Integer, String> fizzBuzz1(int n) {
		Map<Integer, String> result = new HashMap<>();
		for (int i = 1; i < n; i++) {
			if ((i % 3) == 0) {
				result.put(i, FIZZ);
				System.out.println(String.format("%d %s", i, FIZZ));
			} else if ((i % 5) == 0) {
				result.put(i, BUZZ);
				System.out.println(String.format("%d %s", i, BUZZ));
			} else if (((i % 3) == 0) && ((i % 5) == 0)) {
				result.put(i, FIZZBUZZ);
				System.out.println(String.format("%d %s", i, FIZZBUZZ));
			} else {
				System.out.println(i);
			}
		}
		return result;
	}

	/**
	 * Determine if a word is the same if reversed
	 * @param word The word to test if it is a palindrome
	 * @return true if the work is the same if reversed
	 */
	public static boolean isPalindrome(String word) {
		if (word == null) return false;
		StringBuilder reverse = new StringBuilder();
		for (int i = (word.length() - 1); i >= 0; i--) {
			reverse.append(word.charAt(i));
		}
		System.out.println(String.format("%s == %s", word, reverse.toString()));
		return word.equals(reverse.toString());
	}	
}