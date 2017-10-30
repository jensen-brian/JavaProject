package com.practice.code;

public class Words {

	/**
	 * From: https://leetcode.com/problems/reverse-words-in-a-string-iii/
	 * 
	 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
	 * 
	 * Example 1:
	 * Input: "Let's take LeetCode contest"
	 * Output: "s'teL ekat edoCteeL tsetnoc"
	 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
	 * 
	 * 
	 * @author Brian Jensen
	 * Date: 10/29/2017
	 */
	public static String reverseWords(String input) {
		String[] words = input.split(" ");
		String reversed = "";
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			
			for (int j = (word.length() - 1); j >= 0; j--) {
				reversed += word.charAt(j);
			}
			
			// see if we need a space
			if ((i + 1) < words.length) {
				reversed += " ";
			}
		}
		return reversed;
	}
}