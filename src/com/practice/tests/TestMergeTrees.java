package com.practice.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.practice.code.TreeNode;
import com.practice.code.TreeNodeTeasers;

/**
 * From: https://leetcode.com/problems/merge-two-binary-trees/
 * 
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
 * 
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 * 
 * Input: 
 * 	Tree 1                     Tree 2                  
 *           1                         2                             
 *          / \                       / \                            
 *         3   2                     1   3                        
 *        /                           \   \                      
 *       5                             4   7                  
 * Output: 
 * Merged tree:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \ 
 * 	 5   4   7
 * 
 * Note: The merging process must start from the root nodes of both trees.
 * 
 * @author Brian Jensen
 * Date: 9/21/2017
 */
public class TestMergeTrees {

	@Test
	public void testSuccess() {
		TreeNode t1 = createInput1();
		TreeNode t2 = createInput2();
		
		TreeNode actual = TreeNodeTeasers.mergeTrees(t1, t2);
		
		TreeNode expected = createExpected();
		
		assertEquals(expected, actual);
	}

	private TreeNode createInput1() {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.left.left = new TreeNode(5);
		
		t1.right = new TreeNode(2);
		return t1;
	}
	private TreeNode createInput2() {
		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.left.right = new TreeNode(4);
		
		t2.right = new TreeNode(3);
		t2.right.right = new TreeNode(7);
		return t2;
	}
	private TreeNode createExpected() {
		TreeNode expected = new TreeNode(3);
		expected.left = new TreeNode(4);
		expected.left.left = new TreeNode(5);
		expected.left.right = new TreeNode(4);
		
		expected.right = new TreeNode(5);
		expected.right.right = new TreeNode(7);
		return expected;
	}	
}