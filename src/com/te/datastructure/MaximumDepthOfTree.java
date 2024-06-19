package com.te.datastructure;

/*
 * find maximum depth or height of binary tree 
 */

public class MaximumDepthOfTree {
	private static class Node{
		int data;
		Node left, right;
		
		public Node(int item) {
			data = item;
			left = right = null;
		}
	}
	private Node root;
	public static int maxLength(Node node) {
		if(node==null) {
			return 0;
		} else {
			int lDepth = maxLength(node.left);
			int rDepth = maxLength(node.right);
			if(lDepth> rDepth) {
				return (lDepth + 1);
			} else {
				return (rDepth + 1);
			}
		}
		
	}
	public static void main(String[] args) {
		MaximumDepthOfTree tree = new MaximumDepthOfTree();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		System.out.println(maxLength(tree.root));
	}

}
