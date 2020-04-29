package com.search.alg2;

public class BstOrder {

	static Node root;

	public BstOrder() {
		root = null;
	}

	public void insert(int key) {
		root = insertCall(root, key);
	}

	public Node insertCall(Node root, int key) {
		if (root == null) {
			root = new Node(key);
		} else if (root.key < key) {
			root.right = insertCall(root.right, key);
		} else if (root.key > key) {
			root.left = insertCall(root.left, key);
		}
		return root;
	}
	
//	===========================================================
	public void insertParent(int key) {
		root = insertCallParent(root, key);
	}
	public Node insertCallParent(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			root.parent = null;
		} else if (root.key < key) {
			Node rchild = insertCallParent(root.right, key);
			root.right = rchild;
			rchild.parent = root;
		} else if (root.key > key) {
			Node lchild  = insertCallParent(root.left, key);
			root.left = lchild;
			lchild.parent= root;
		}
		return root;
	}
	
	
	public void inOrderParent() {
		inOrderTraverseParent(root);
	}
	public void inOrderTraverseParent(Node root) {
		if (root != null) {
			inOrderTraverseParent(root.left);
			System.out.print(root.key);
			if(root.parent==null) {
				System.out.println("parent is null");
			}else {
				System.out.println("Parent is " + root.parent.key);
			}
			inOrderTraverseParent(root.right);
		}
	}
//	===========================================================
	public void inOrder() {
		inOrderTraverse(root);
	}
	public void inOrderTraverse(Node root) {
		if (root != null) {
			inOrderTraverse(root.left);
			System.out.println(root.key);
			inOrderTraverse(root.right);
		}
	}
	
	
	public void preOrder() {
		preOrderTraverse(root);
	}
	public void preOrderTraverse(Node root) {
		if (root != null) {	
			System.out.println(root.key);
			preOrderTraverse(root.left);			
			preOrderTraverse(root.right);
			
		}
	}
	
	
	
	public void postOrder() {
		postOrderTraverse(root);
	}
	public void postOrderTraverse(Node root) {
		if (root != null) {			
			postOrderTraverse(root.left);			
			postOrderTraverse(root.right);
			System.out.println(root.key);
		}
	}
	
	public boolean checkIfNodeExist(Node root, int se) {
		if(root==null) {
			return false;
		}
		if(root.key==se) {
			return true;
		}
//		boolean res1 = checkIfNodeExist(root.left,se);
//		boolean res2 = checkIfNodeExist(root.right,se);
//		
//		if( res1||res2) {
//			return true;
//		}
		if(root.key<se) {
			return checkIfNodeExist(root.right, se);
		}else if(root.key>se) {
			return checkIfNodeExist(root.left, se);
		}
		
		return false;
		
	}
	
	public int findMaximum(Node root) {
		while(root.right!=null) {
			root=root.right;
		}
		return root.key;
		
	}


	public static void main(String[] args) {
		BstOrder tree = new BstOrder();
//		tree.insert(50); 
//        tree.insert(30); 
//        tree.insert(20); 
//        tree.insert(40); 
//        tree.insert(70); 
//        tree.insert(60); 
//        tree.insert(80);
//        tree.insert(35);
        
        tree.insertParent(50); 
        tree.insertParent(30); 
        tree.insertParent(20); 
        tree.insertParent(40); 
        tree.insertParent(70); 
        tree.insertParent(60); 
        tree.insertParent(80);
        tree.insertParent(35);
        int se=90;
		// Traverse in InOrder
        tree.inOrderParent();
//        System.out.println("=========================");
//        tree.preOrder();
//        System.out.println("=========================");
//        tree.postOrder();
        System.out.println(tree.checkIfNodeExist(root, se));
        
//        System.out.println(tree.findMaximum(root));
	}

}
