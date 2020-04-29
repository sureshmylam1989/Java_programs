package com.search.alg2;

public class ISBinaryTreeBST {
	static Node root;

	public ISBinaryTreeBST() {
		root = null;
	}

	public boolean isBST(Node root) {
		return isTreeBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isTreeBST(Node root, Integer min, Integer max) {
		if (root == null) {
			return true;
		}

		if (root.key < min || root.key > max) {
			return false;
		}

		return (isTreeBST(root.left, min, root.key - 1) && isTreeBST(root.right, root.key + 1, max));
	}

	public static void main(String[] args) {
		ISBinaryTreeBST tree = new ISBinaryTreeBST();
		root = new Node(3);
		root.right = new Node(5);
		root.left = new Node(2);
		root.left.right = new Node(4);
		root.left.left = new Node(1);
		System.out.println(tree.isBST(root));
	}

}
