package com.bridgelabz.oop.ds;


public class StackList {
	static Node head;
	
	public static <T> void push(T data) {
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
	
	public static <T> T pop() {
		Node temp = head;
		Node prev = head;
		while(temp.nextRefOfNode != null) {
			prev = temp;
			temp = temp.nextRefOfNode;
		}
		prev.nextRefOfNode = null;
		
		return (T) temp.data;
	}
	
	public static void printList() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(""+temp.data+" -> ");
			temp = temp.nextRefOfNode;
		}
	}
	
	public static void main(String[] args) {
		push(100);
		push(200);
		push(300);
		push(400);
		
		printList();
		System.out.println();
		
		System.out.println("Pop data = "+pop());
		System.out.println("After Poped ");
		printList();
	}
}
