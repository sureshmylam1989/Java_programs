package com.coding;
public class LinkedList {	
	static Node head; 
	static class Node { 
		char data; 
		Node next; 
		Node(char string) { 
			data = string; 
			next = null; 
		} 
	} 
	/* Function to reverse the linked list */
	Node reverse(Node node) { 
		Node prev = null; 
		Node current = node; 
		Node next = null; 
		int count =0;
		while (current != null) { 
			System.out.println(count);
			if(current.data == ' ') {
				prev = current;
				current = current.next; 
				continue;
		      }
			next = current.next; 
			current.next = prev; 
			prev = current; 
			current = next; 
			count=+1;
		} 
		node = prev; 
		return node; 
	} 
	// prints content of double linked list 
	void printList(Node node) { 
		while (node != null) { 
			System.out.print(node.data); 
			node = node.next; 
		} 
	} 	
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 
		list.head = new Node('A'); 
		list.head.next = new Node('B'); 
		list.head.next.next = new Node(' ');
		list.head.next.next.next = new Node('c'); 
		list.head.next.next.next.next = new Node('D'); 		
		System.out.println("Given Linked list"); 
		list.printList(head); 
		head = list.reverse(head); 
		System.out.println(""); 
		System.out.println("Reversed linked list "); 
		list.printList(head); 
	} 
}
