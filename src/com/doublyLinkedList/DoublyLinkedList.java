package com.doublyLinkedList;

public class DoublyLinkedList {
	Node head;
	
DoublyLinkedList() {
	this.head = null;
}


void insertAtFront(int data) {
    Node newNode = new Node(data);

    if (head != null) {
        head.prevNodeLocation = newNode;
        newNode.nextNodeLocation = head;
    }

    newNode.prevNodeLocation = null;
    head = newNode;
}


void insertAtRear(int data) {
	Node newNode = new Node(data);
	
	if(head == null ) {
		head = newNode;
		return;
	}
	Node current = head;
	while(current.nextNodeLocation != null) {
		current = current.nextNodeLocation;
	}
	current.nextNodeLocation =  newNode;
	newNode.prevNodeLocation = current;
}

void swapNodesNtime() {

	
	Node dummy = new Node(0);
	dummy.nextNodeLocation = head;
	if (head != null) head.prevNodeLocation = dummy;

	Node prev = dummy;
	Node cur = head;

	while (cur != null && cur.nextNodeLocation != null) {
	    Node second = cur.nextNodeLocation;
	    Node npn = second.nextNodeLocation;

	    // Swap
	    second.nextNodeLocation = cur;
	    second.prevNodeLocation = prev;

	    cur.nextNodeLocation = npn;
	    cur.prevNodeLocation = second;

	    prev.nextNodeLocation = second;

	    if (npn != null) {
	        npn.prevNodeLocation = cur;
	    }

	    // Move forward
	    prev = cur;
	    cur = npn;
	}

	head = dummy.nextNodeLocation;
	if (head != null) head.prevNodeLocation = null;
      
}

void printReverse() {
	Node current = head;
	while(current.nextNodeLocation != null) {
		current = current.nextNodeLocation;
	}
	while(current.prevNodeLocation != null) {
		System.out.print(current.data+ "<-");
		current = current.prevNodeLocation ;
	}
	System.out.print(current.data);
}



void printForword() {
	Node current = head;
	while(current.nextNodeLocation != null) {
		System.out.print( current.data + "->");
		current = current.nextNodeLocation;
	}
	System.out.print(current.data);
}
	
	void printList() {
	    Node current = head;
	    while (current != null) {
	        System.out.println(
	            (current.prevNodeLocation != null ? current.prevNodeLocation.data : "null") + " | " +
	            current.data + " | " +
	            (current.nextNodeLocation != null ? current.nextNodeLocation.data : "null")
	        );
	        current = current.nextNodeLocation;
	    }
	

}



}
