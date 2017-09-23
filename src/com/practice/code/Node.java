package com.practice.code;

import java.util.ArrayList;
import java.util.List;

public class Node {

	public int val;
	public Node parent;
	public List<Node> children;
	
	public Node(int x) {
		val = x;
	}
	
	public void append(Node child) {
		if (child == null) { return; }
		// set this as the parent
		child.parent = this;
		
		if (children == null) { children = new ArrayList<>(); }
		children.add(child);
	}
	
	@Override
	public int hashCode() {
		return calculateHash(this);
	}
	
	private static int calculateHash(Node node) {
		final int prime = 31;
		
		if (node == null) { return 0; }
		int hash = prime * node.val;
		if (node.children != null) {
			for (int i = 0; i < node.children.size(); i++) {
				Node child = node.children.get(i);
				hash += calculateHash(child);
			}
		}
		return hash;		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) { return false; }
		if (!(obj instanceof Node)) { return false; }
		Node test = (Node)obj;
		if (this.val != test.val) { return false; }
		if (this.children != null && test.children == null) { return false; }
		if (this.children == null && test.children != null) { return false; }
		
		// if both are null we are at the tail, if not we have to check the children
		if (this.children != null && test.children != null) {		
			if (this.children.size() != test.children.size()) { return false; }
			
			// now to check the children, order does not matter
			for (int i = 0; i < this.children.size(); i++) {
				Node thisChild = this.children.get(i);
				
				for (int j = 0; j < test.children.size(); j++) {
					Node testChild = test.children.get(j);
					
					// if the values are the same then we will recursively check this child equals the other
					if (thisChild.val == testChild.val) {
						if (!thisChild.equals(testChild)) { return false; }
						break;
					}
				}
			}
		}
		
		return true;
	}
}