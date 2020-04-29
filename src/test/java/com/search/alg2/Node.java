package com.search.alg2;

public class Node {
	int key;
	Node left,right,parent;
	
	Node(int item){
		this.key = item;
		left=right=parent = null;
	}

}
