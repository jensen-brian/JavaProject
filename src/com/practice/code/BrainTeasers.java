package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Brain teaser class for practicing.
 * 
 * @author Brian Jensen
 * Date: 09/15/2017
 */
/**
 * @author brian.jensen
 *
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

	/**
	 * Rotate an array of n elements to the right by k steps.
	 * 
	 * @param nums The array to rotate.
	 * @param k Rotate to the right k steps.
	 * @return
	 */
	public static int[] rotate(int[] nums, int k) {
		// do not process if the array is null or k < 1
		if (nums == null || k < 1) return null;
		
		System.out.println("Input: " + Arrays.toString(nums));
		System.out.println("Rotate on: " + k);
		
		// create the indexer from the back of the array
		int indexer = (nums.length - k);
		
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			indexer = (indexer < nums.length) ? indexer : 0;
			int val = nums[indexer++];
			// put the new value in the array
			result[i] = val;
		}
		
		System.out.println("Output: " + Arrays.toString(result));
		return result;
	}

	/**
	 * Given an array and a value, remove all instances of that value in place and return the new length.
	 * 
	 * @param nums The array to remove val from.
	 * @param val The value to remove from the array.
	 * @return The number of matching values in the array.
	 */
	public static int removeElement(int[] nums, int val) {
		System.out.println("Start: " + Arrays.toString(nums));
		
		int count = 0;
		int moveIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			int number = nums[i];
			nums[i] = -1; // remove
			
			if (number != val) {
				// count where it does not match
				count++;
				
				nums[moveIndex] = number;
				moveIndex++;
			}
		}
		
		System.out.println("End:   " + Arrays.toString(nums));
		return count;
	}

	/**
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * 
	 * @param nums Array of numbers to add up two to equal the target.
	 * @param target The target to add two numbers to equal.
	 * @return An Array of the two numbers that add to the target.
	 */
	public static int[] twoSum(int[] nums, int target) {
		// must have two number to add and cannot be negative target
		if (nums == null || nums.length < 2 || target < 0) return null;

		System.out.println("Start: " + Arrays.toString(nums));
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				int one = nums[i];
				int two = nums[j];
				if ((one + two) == target) {
					int[] found = {one, two};
					System.out.println("Found: " + Arrays.toString(found));
					return found;
				}
			}
		}

		return null;
	}	
}