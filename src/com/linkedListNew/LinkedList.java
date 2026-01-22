package com.linkedListNew;
class Node {
	int data;
	Node nextLink;
	
	Node(int data) {
		this.data = data;
		nextLink = null;
	}
}
public class LinkedList {
	Node head;

	 LinkedList() {
		 Node head = null;
	 }
	 
	 void addAtBack(int data) {
		 Node newNode = new Node(data);
		 if(head == null) {
			 head = newNode;
			 return;
		 } 
		 Node current = head;
		 while(current.nextLink != null) {
			 current = current.nextLink;
		 }
		 current.nextLink = newNode;
	 }
	 
	 void insertAtFront(int data) {
		 Node newNode = new Node(data);
		 if(head == null) {
			 head = newNode;
			 return;
		 }
		 
		 newNode.nextLink = head;
		 head = newNode;
	 }
	 void print() {
		 if(head == null) System.out.println("Empty Linked List");
		 else
		 {
			 Node current = head;
			 while(current != null) {
				 System.out.print(current.data + " -> ");
				 current = current.nextLink;
			 }
			 System.out.println(current);
		 }
	 }

}
