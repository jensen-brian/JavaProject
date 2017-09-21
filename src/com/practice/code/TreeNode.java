package com.practice.code;

public class TreeNode {
	private static int PRIME = 31;
	
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) { val = x; }
	
	@Override
	public int hashCode() {
		int hash = PRIME * this.val;
		hash += calculateHash(this.left);
		hash += calculateHash(this.right);
		return hash;
	}
	
	private static int calculateHash(TreeNode node) {
		if (node == null) return 0;
		int hash = (PRIME * node.val);
		hash += calculateHash(node.left);
		hash += calculateHash(node.right);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		TreeNode root = this;
		return TreeNode.equalsRecursive(root, obj);
	}
	
	private static boolean equalsRecursive(TreeNode main, Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof TreeNode)) return false;
		
		TreeNode test = (TreeNode)obj;
		
		// test the current node's value
		if (main.val != test.val) return false;

		// test left and right nodes
		if (!TreeNode.testLeaf(main.left, test.left)) return false;
		if (!TreeNode.testLeaf(main.right, test.right)) return false;

		return true;		
	}
	
	private static boolean testLeaf(TreeNode leaf1, TreeNode leaf2) {
		if (leaf1 == null && leaf1 == null) return true;
		
		if (leaf1 != null && leaf2 != null) {
			if (!TreeNode.equalsRecursive(leaf1, leaf2)) {
				return false;
			}
		} else {
			return false;
		}
		return true;
	}
}