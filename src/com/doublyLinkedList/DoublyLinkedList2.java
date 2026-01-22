package com.doublyLinkedList;

public class DoublyLinkedList2 {
	Node head;
	
	DoublyLinkedList2() {
		head = null;
	}
	
	
	void insertAtFront(int data) {
		Node newNode = new Node(data);
		if(head == null ) {
			head = newNode;
			return;
		}
		
		
		head = newNode;
		newNode.prevNodeLocation = null;
		
	}
	
	void swapNode() {
		Node dummy =  new Node(0);
		
		dummy = head;
		while(dummy.nextNodeLocation != null && dummy.prevNodeLocation != null) {
			
		}
		
		
	}
	
	void insertAtRear(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.nextNodeLocation != null) {
			current = current.nextNodeLocation;
		}
		current.nextNodeLocation = newNode;
		newNode.prevNodeLocation = current;
	}
	
	
	void printForword() {
		if(head == null) {
			System.out.print("Empty");
			return;
		}
		
		Node current = head;
		while(current.nextNodeLocation != null) {
			System.out.print(current.data + "->");
			current = current.nextNodeLocation;
		}
		System.out.print(current.data);
	}
	
	
	
	void printReverse() {
		if(head == null) {
			System.out.print("Empty");
			return;
		}
		Node current = head;
		while(current.nextNodeLocation != null) {
			current = current.nextNodeLocation;
		}
		
		while(current.prevNodeLocation != null) {
			System.out.print(current.data+"<-");
			current = current.prevNodeLocation;
		}
		System.out.print(current.data);
	}

}
