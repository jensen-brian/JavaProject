package com.practice.tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.practice.code.BrainTeasers;

/**
 * From: https://leetcode.com/problems/two-sum/
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * @author Brian Jensen
 * Date: 9/16/2017
 */
public class TestTwoSums {

	@Test
	public void testSuccess() {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] actual = BrainTeasers.twoSum(nums, target);
		
		int[] expected = {2, 7};
		assertArrayEquals(expected, actual);
		
		target = 22;
		actual = BrainTeasers.twoSum(nums, target);
		expected = new int[] {7, 15};
		assertArrayEquals(expected, actual);
		
		target = 17;
		actual = BrainTeasers.twoSum(nums, target);
		expected = new int[] {2, 15};
		assertArrayEquals(expected, actual);
		
		target = 26;
		actual = BrainTeasers.twoSum(nums, target);
		expected = new int[] {11, 15};
		assertArrayEquals(expected, actual);
	}
}