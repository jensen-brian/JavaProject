package com.practice.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.practice.code.Words;

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
public class TestWordProblems {

	@Test
	public void testSuccess() {
		String input = "Let's take LeetCode contest";
		String expected = "s'teL ekat edoCteeL tsetnoc";

		System.out.println(String.format("Input:\t\t|%s|", input));
		System.out.println(String.format("Expected:\t|%s|", expected));

		
		String actual = Words.reverseWords(input);
		
		System.out.println(String.format("Actual:\t\t|%s|", actual));
		
		assertEquals(expected, actual);
	}
}