package com.bridgelabz.oop.ds;

class Node <T> {
	
	T data;
	Node nextRefOfNode;
	
	public Node(T data) {
		this.data = data;
		nextRefOfNode = null;
	}
}

public class LinkedList {

	static Node head;
	
	public static void main(String[] args) {
		
//		Node node1 = new Node(100);
//		Node node2 = new Node(200);
//		Node node3 = new Node(300);
//		Node node4 = new Node(400);
//		Node node5 = new Node("Shubham");
//		
//		node1.nextRefOfNode = node2;
//		node2.nextRefOfNode = node3;
//		node3.nextRefOfNode = node4;
//		node4.nextRefOfNode = node5;
		
		add(100);
		add(200);
		add(300);
		add(400);
		
		printList();
	}
	
	public static void printList() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(""+temp.data+" -> ");
			temp = temp.nextRefOfNode;
		}
	}
	
	public static <T> void add(T data) {
		Node temp = head;
		
		Node newNode = new Node(data);
		
		if(temp == null) {
			head = newNode;
		}else {
			while(temp.nextRefOfNode != null) {
				temp = temp.nextRefOfNode;
			}
			temp.nextRefOfNode = newNode;
		}
	}
	
	// int size(); return total count of nodes
	// boolean isEmpty() check whether your list is empty or not
	// addAtFirst(T data) add the data at first position
	// addAtPosition(int position, T data) add data at any position
	// removeAtFirst()  remove the data at first position
	// removeAtLast() remove data at last position
}
