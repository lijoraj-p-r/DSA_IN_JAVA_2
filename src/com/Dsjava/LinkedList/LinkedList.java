package com.Dsjava.LinkedList;

public class LinkedList {

	Node head;
	int size ;
	
	LinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	int get(int index) {
		if (index < 0 || index >= size)
			return -1;
		
		Node current = head;
		for (int i = 0; i <= index; i++) {
			current = current.next;
		}
		return current.data;
	}
	
	void addAtHead(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
		size++;
		
	}
	
	void addAtTail(int val) {
		Node newNode = new Node(val);
		
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
		size++;
		
	}
	
	void addAtIndex(int index, int val) {
	    if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }
        
		Node newNode = new Node(val);
		Node current = head;
		for (int i = 0; i < index -1; i++) {
			
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
		size++;
	}
	
	void deleteAtIndex(int index) {
		 if (index < 0 || index >= size) return;

	        if (index == 0) {
	            head = head.next;
	        } else {
	            Node curr = head;
	            for (int i = 0; i < index - 1; i++) {
	                curr = curr.next;
	            }
	            curr.next = curr.next.next;
	        }
	        size--;
	    }
	
	
	void swap(int index1, int index2) {
		Node current = head;
		
		for (int i = 0; i < index1; i++) {
			current = current.next;
		}
	Node temp = current.next;
	current.next = current.next.next;
	current.next = temp;
	}
	

	
	void traverse() {
		if(head == null) {
			System.out.println("Display not possible LinkedList is empty!");
			return;
		}
		
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;			
		}
		System.out.print("empty");	
		System.out.println();	
		System.out.println("size: " + size);	
	}

}
