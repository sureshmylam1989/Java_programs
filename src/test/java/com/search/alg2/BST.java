package com.search.alg2;

public class BST {
	Node root;

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			this.key = item;
			left = right = null;
		}
	}

	BST() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
		} else if (root.key < key) {
			root.right = insertRec(root.right, key);
		} else if (root.key > key) {
			root.left = insertRec(root.left, key);
		}
		return root;
	}

	void inOrder() {
		inOrderRec(root);
	}

	void inOrderRec(Node root) {
		if (root != null) {
			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);
		}
	}

	void deleteKey(int key) {
		root = deleteRec(root, key);
	}
	
	public Node deleteRec(Node root,int key) {
		
		if(root==null) {
			return root;
		}
		
		if(root.key>key) {
			root.left = deleteRec(root.left, key);
		}else if(root.key<key) {
			root.right = deleteRec(root.right, key);
		}else {
			if(root.left!=null && root.right!=null) {
				Node temp = root;
				int min = minValue(temp.right);
				root.key = min;
				root.right = deleteRec(root.right, min);
			}else if(root.left!=null) {
				root = root.left;
			}else if(root.right!=null) {
				root = root.right;
			}else {
				root=null;
			}
		}
		
		return root;
	}
	

	int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inOrder();
		tree.deleteKey(70);
		System.out.println("Inorder traversal of the modified tree");
		tree.inOrder();
	}

}
