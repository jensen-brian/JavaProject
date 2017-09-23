package com.practice.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.practice.code.Node;
import com.practice.code.TreeNodeTeasers;

/**
 * From: Will add comments later.
 * 
 * @author Brian Jensen
 * Date: 9/22/2017
 */
public class TestNode {

	@Test
	public void success() {
		int map[][] = {
			{3, 4},
			{4, 2},
			{3, 1},
			{5, 3}
		};
		
		Node actual = TreeNodeTeasers.build(map);
		
		Node expected = new Node(5);
		Node three = new Node(3);
		expected.append(three);
		
		Node four = new Node(4);
		Node one = new Node(1);
		three.append(four);
		three.append(one);
		
		Node two = new Node(2);
		four.append(two);
		
		assertEquals(expected, actual);
	}
}