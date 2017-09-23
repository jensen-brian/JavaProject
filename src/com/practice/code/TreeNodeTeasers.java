package com.practice.code;

import java.util.HashMap;

public class TreeNodeTeasers {

	/**
	 * From: https://leetcode.com/problems/merge-two-binary-trees/
	 * 
	 * @author Brian Jensen
	 * Date: 9/21/2017
	 * 
	 * @param t1 First TreeNode to merge with the second.
	 * @param t2 Second TreeNode to merge with the first.
	 * @return The merged TreeNode.
	 */
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) { return null; }
		if (t1 != null && t2 == null) { return t1; }
		if (t1 == null && t2 != null) { return t2; }
		TreeNode merged = new TreeNode(t1.val + t2.val);
		merged.left = mergeTrees(t1.left, t2.left);
		merged.right = mergeTrees(t1.right, t2.right);
		return merged;
	}
	
	/**
	 * From: Will add comments later. 
	 * 
	 * @author Brian Jensen
	 * Date: 9/21/2017
	 * 
	 * @param map The double array representation of the tree node [parent, child]
	 * @return The completed Nodes created from the double array.
	 */
	public static Node build(int[][] map) {
		HashMap<Integer, Node> nodeMap = new HashMap<>();
		
		for (int i = 0; i < map.length; i++) {
			int parent = map[i][0];
			int child = map[i][1];
			
			// look for the parent node
			Node parentNode = nodeMap.get(parent);
			// if the parent is not in the map then create the node and add it
			if (parentNode == null) {
				parentNode = new Node(parent);
				// add to the node map so we can find it again later
				nodeMap.put(parent, parentNode);
			}
			
			// look for the child node
			Node childNode = nodeMap.get(child);
			if (childNode == null) {
				childNode = new Node(child);
				// add to the node map so we can find it again later
				nodeMap.put(child, childNode);
			}
			// add the child to the parent
			parentNode.append(childNode);
		}
		
		// find the root nope to return
		Node root = null;
		if (!nodeMap.isEmpty()) {
			for (Integer key : nodeMap.keySet()) {
				root = nodeMap.get(key);
				if (root.parent == null) {
					// found the root = stop looking
					break;
				}
			}
		}
		
		return root;
	}
}