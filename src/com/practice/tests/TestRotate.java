package com.practice.tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.practice.code.BrainTeasers;

/**
 * From: https://leetcode.com/problems/rotate-array/
 *
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * 
 * @author Brian Jensen
 * Date: 9/16/2017
 */
public class TestRotate {

	@Test
	public void testSuccess() {
		int[] input = {1,2,3,4,5,6,7};
		int rotate = 3;
		int[] expected = {5,6,7,1,2,3,4};
		
		int[] actual = BrainTeasers.rotate(input, rotate);
		
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testAnotherSuccess() {
		int[] input = {10,9,8,7,6,5,4,3,2,1};
		int rotate = 4;
		int[] expected = {4,3,2,1,10,9,8,7,6,5};
		
		int[] actual = BrainTeasers.rotate(input, rotate);
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testNull() {
		int[] input = null;
		int rotate = 4;
		int[] expected = null;
		
		int[] actual = BrainTeasers.rotate(input, rotate);
		
		assertArrayEquals(expected, actual);
	}	
}