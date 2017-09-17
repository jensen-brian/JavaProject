package com.practice.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.practice.code.LinkListTeasers;
import com.practice.code.ListNode;
import com.practice.code.MyLinkedList;

/**
 * From: https://leetcode.com/problems/odd-even-linked-list/
 * 
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 * 
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * 
 * Example:
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 * 
 * Note:
 * The relative order inside both the even and odd groups should remain as it was in the input. 
 * The first node is considered odd, the second node even and so on ...
 * 
 * 
 * @author Brian Jensen
 * Date: 9/17/2017
 */
public class TestLinkLists {

	@Test
	public void testMixedList() {
		MyLinkedList oddEvenList = new MyLinkedList(); 
		oddEvenList.add(2);
		oddEvenList.add(1);
		oddEvenList.add(4);
		oddEvenList.add(3);
		oddEvenList.add(6);
		oddEvenList.add(5);
		oddEvenList.add(7);
		oddEvenList.add(8);
		MyLinkedList.print(oddEvenList.getHead());
		
		ListNode actual = LinkListTeasers.oddEvenList(oddEvenList.getHead());
		
		int[] expected = {1,3,5,7,2,4,6,8};

		assertNotNull(actual);
		MyLinkedList.print(actual);
		
		ListNode test = actual;
		int index = 0;
		while (test != null) {
			System.out.println(String.format("%d == %d", expected[index], test.val));
			assertEquals(expected[index], test.val);
			// increment to the next
			test = test.next;
			index++;
		}
	}

	@Test
	public void testAnotherMixedList() {
		MyLinkedList oddEvenList = new MyLinkedList(); 
		oddEvenList.add(2);
		oddEvenList.add(1);
		oddEvenList.add(4);
		oddEvenList.add(3);
		oddEvenList.add(6);
		oddEvenList.add(5);
		oddEvenList.add(7);
		oddEvenList.add(8);
		MyLinkedList.print(oddEvenList.getHead());
		
		ListNode actual = LinkListTeasers.anotherOddEvenList(oddEvenList.getHead());
		
		int[] expected = {1,3,5,7,2,4,6,8};

		assertNotNull(actual);
		MyLinkedList.print(actual);
		
		ListNode test = actual;
		int index = 0;
		while (test != null) {
			System.out.println(String.format("%d == %d", expected[index], test.val));
			assertEquals(expected[index], test.val);
			// increment to the next
			test = test.next;
			index++;
		}
	}
	
	@Test
	public void testOddEvenList() {
		MyLinkedList oddEvenList = new MyLinkedList(); 
		oddEvenList.add(1);
		oddEvenList.add(2);
		oddEvenList.add(3);
		oddEvenList.add(4);
		oddEvenList.add(5);
		MyLinkedList.print(oddEvenList.getHead());
		
		ListNode actual = LinkListTeasers.oddEvenList(oddEvenList.getHead());
		
		int[] expected = {1,3,5,2,4};

		assertNotNull(actual);
		MyLinkedList.print(actual);
		
		ListNode test = actual;
		int index = 0;
		while (test != null) {
			System.out.println(String.format("%d == %d", expected[index], test.val));
			assertEquals(expected[index], test.val);
			// increment to the next
			test = test.next;
			index++;
		}
	}

	@Test
	public void testAnotherOddEvenList() {
		MyLinkedList oddEvenList = new MyLinkedList(); 
		oddEvenList.add(1);
		oddEvenList.add(2);
		oddEvenList.add(3);
		oddEvenList.add(4);
		oddEvenList.add(5);
		MyLinkedList.print(oddEvenList.getHead());
		
		ListNode actual = LinkListTeasers.anotherOddEvenList(oddEvenList.getHead());
		
		int[] expected = {1,3,5,2,4};

		assertNotNull(actual);
		MyLinkedList.print(actual);
		
		ListNode test = actual;
		int index = 0;
		while (test != null) {
			System.out.println(String.format("%d == %d", expected[index], test.val));
			assertEquals(expected[index], test.val);
			// increment to the next
			test = test.next;
			index++;
		}
	}
	
	@Test
	public void testEvenOddList() {
		MyLinkedList oddEvenList = new MyLinkedList(); 
		oddEvenList.add(2);
		oddEvenList.add(4);
		oddEvenList.add(1);
		oddEvenList.add(3);
		oddEvenList.add(5);
		MyLinkedList.print(oddEvenList.getHead());
		
		ListNode actual = LinkListTeasers.oddEvenList(oddEvenList.getHead());
		
		int[] expected = {1,3,5,2,4};

		assertNotNull(actual);
		MyLinkedList.print(actual);
		
		ListNode test = actual;
		int index = 0;
		while (test != null) {
			System.out.println(String.format("%d == %d", expected[index], test.val));
			assertEquals(expected[index], test.val);
			// increment to the next
			test = test.next;
			index++;
		}
	}
		
	@Test
	public void testOddList() {
		MyLinkedList oddEvenList = new MyLinkedList(); 
		oddEvenList.add(1);
		oddEvenList.add(3);
		oddEvenList.add(5);
		MyLinkedList.print(oddEvenList.getHead());
		
		ListNode actual = LinkListTeasers.oddEvenList(oddEvenList.getHead());
		
		int[] expected = {1,3,5};

		assertNotNull(actual);
		MyLinkedList.print(actual);
		
		ListNode test = actual;
		int index = 0;
		while (test != null) {
			System.out.println(String.format("%d == %d", expected[index], test.val));
			assertEquals(expected[index], test.val);
			// increment to the next
			test = test.next;
			index++;
		}
	}
	
	@Test
	public void testEvenList() {
		MyLinkedList oddEvenList = new MyLinkedList(); 
		oddEvenList.add(2);
		oddEvenList.add(4);
		oddEvenList.add(6);
		MyLinkedList.print(oddEvenList.getHead());
		
		ListNode actual = LinkListTeasers.oddEvenList(oddEvenList.getHead());
		
		int[] expected = {2,4,6};

		assertNotNull(actual);
		MyLinkedList.print(actual);
		
		ListNode test = actual;
		int index = 0;
		while (test != null) {
			System.out.println(String.format("%d == %d", expected[index], test.val));
			assertEquals(expected[index], test.val);
			// increment to the next
			test = test.next;
			index++;
		}
	}	
	
}