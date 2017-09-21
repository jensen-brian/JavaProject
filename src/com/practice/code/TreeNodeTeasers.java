package com.practice.code;

public class TreeNodeTeasers {

	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) { return null; }
		if (t1 != null && t2 == null) { return t1; }
		if (t1 == null && t2 != null) { return t2; }
		TreeNode merged = new TreeNode(t1.val + t2.val);
		merged.left = mergeTrees(t1.left, t2.left);
		merged.right = mergeTrees(t1.right, t2.right);
		return merged;
	}
}