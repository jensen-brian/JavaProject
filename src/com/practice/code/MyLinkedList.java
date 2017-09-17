package com.practice.code;

public class MyLinkedList {
	private ListNode _head;
	
	public ListNode getHead() {
		return _head;
	}

	public void add(int value) {
		if (_head == null) {
			_head = new ListNode(value);
		} else {		
			ListNode currentNode = _head;
			ListNode nextNode = currentNode.next;
			while (nextNode != null) {
				currentNode = nextNode;
				nextNode = currentNode.next;
			}
			// found where next is null, create the new node
			currentNode.next = new ListNode(value);
		}
	}
	
	public static void print(ListNode head) {
		if (head != null) {
			System.out.print(head.val);
			ListNode nextNode = head.next;
			while (nextNode != null) {
				System.out.print(String.format("->%d", nextNode.val));
				nextNode = nextNode.next;
			}
		}
		System.out.print("->NULL");
		System.out.println();
	}	
}
