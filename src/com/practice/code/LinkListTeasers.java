package com.practice.code;

public class LinkListTeasers {

	public static ListNode oddEvenList(ListNode head) {
		
		MyLinkedList oddEven = new MyLinkedList();
		
		// odd first
		ListNode save = head;
		while (save != null) {
			if ((save.val % 2) != 0) {
				oddEven.add(save.val);
			}
			save = save.next;
		}

		// even last
		save = head; // reset head
		while (save != null) {
			if ((save.val % 2) == 0) {
				oddEven.add(save.val);
			}
			save = save.next;
		}		
		return oddEven.getHead();
	}
	
	/**
	 * Solution from the site only works if the list is an ordered list to begin with.
	 * 
	 * @param head
	 * @return
	 */
	public static ListNode anotherOddEvenList(ListNode head) {
		if (head == null) return null;
		ListNode odd = head;
		ListNode evenHead = head.next;
		ListNode even = evenHead;
		
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		// hook the end of the odd list to the even head
		odd.next = evenHead;
		return head;
	}
}