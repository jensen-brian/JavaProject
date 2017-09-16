package com.practice.tests;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import com.practice.code.BrainTeasers;

public class TestPalindrome {

	@Rule
	public ErrorCollector collector = new ErrorCollector();
	
	@Test
	public void testCollector() {
		System.out.println("testCollector");
		collector.checkThat(BrainTeasers.isPalindrome("pop"), is(true));
		collector.checkThat(BrainTeasers.isPalindrome("abc"), is(false));
		collector.checkThat(BrainTeasers.isPalindrome(null), is(false));
	}

	@Test
	public void testTrue() {
		System.out.println("testTrue");
		assertTrue(BrainTeasers.isPalindrome("pop"));
	}
	
	@Test
	public void testFalse() {
		System.out.println("testFalse");
		assertFalse(BrainTeasers.isPalindrome("abc"));
	}
/*	
	@Test(expected = NullPointerException.class)
	public void testNull() {
		System.out.println("testNull");
		assertTrue(BrainTeasers.isPalindrome(null));
	}
*/
}