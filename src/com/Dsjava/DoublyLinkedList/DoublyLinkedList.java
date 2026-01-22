package com.Dsjava.DoublyLinkedList;

public class DoublyLinkedList {

Node head;
int size;

DoublyLinkedList(){
   this.head = null;
   this.size = 0;
}

void insertAtFront(int data) {
	
	Node newNode = new Node(data);
	if(head == null) {
		head = newNode;
		size++;
		return;
	}
	
	Node temp = head;
	head = newNode;
	newNode.next = temp;
	temp.prev = newNode;
	size++;
	
	
//	Node newNode = new Node(data);
//	if(head == null) {
//		//insertAtEnd(data);
//		head = newNode;
//		size++;
//		return;
//	}
//	
//	Node current = head;
//	head = newNode;
//	newNode.next = current;
//	current.prev= newNode;
//	size++;
	
}

void insertAtEnd(int data) {
	Node newNode = new Node(data);
	if(head == null) {
		head = newNode;
		size++;
	} else {
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		newNode.prev = current;
		size++;
	}
}

void traverseFront() {
	
	if(head == null) return;
	
	Node current = head;
	System.out.print(current.prev + "->");
	while(current != null) {
		System.out.print(current.data + "->");
		current = current.next;
	}
	System.out.println(current);
}


}
