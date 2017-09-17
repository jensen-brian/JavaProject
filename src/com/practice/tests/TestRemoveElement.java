package com.practice.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.practice.code.BrainTeasers;

/**
 * From: https://leetcode.com/problems/remove-element/
 * 
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * 
 * Your function should return length = 2, with the first two elements of nums being 2.
 * 
 * @author Brian Jensen
 * Date: 9/16/2017
 */
public class TestRemoveElement {

	@Test
	public void testSuccess2() {
		int[] nums = {3,2,2,3};
		int val = 3;
		int actual = BrainTeasers.removeElement(nums, val);
		assertEquals(2, actual);
	}
	
	@Test
	public void testSuccess5() {
		int[] nums = {3,2,2,3,1,2,3,5};
		int val = 3;
		int actual = BrainTeasers.removeElement(nums, val);
		assertEquals(5, actual);
	}	
}