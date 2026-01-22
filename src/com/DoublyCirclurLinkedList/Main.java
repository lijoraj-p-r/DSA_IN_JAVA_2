package com.DoublyCirclurLinkedList;

public class Main {

	public static void main(String[] args) {
		
		CircularDoublyLinkedList cdl = new CircularDoublyLinkedList();
		cdl.insertAtEnd(10);
		cdl.insertAtEnd(20);
		cdl.insertAtEnd(30);
		cdl.insertAtEnd(40);
		cdl.insertAtEnd(50);
		cdl.insertAtEnd(60);
		cdl.travelforward();
		cdl.printBackWard();

	}

}
