package com.Dsjava.DoublyLinkedList;

public class Main {

	public static void main(String[] args) {

		DoublyLinkedList dbLinkedList = new DoublyLinkedList();
		
		dbLinkedList.insertAtEnd(15);
		dbLinkedList.insertAtEnd(20);

		dbLinkedList.insertAtEnd(30);
		dbLinkedList.insertAtFront(10);

		dbLinkedList.insertAtEnd(40);
		dbLinkedList.insertAtFront(5);
		
		dbLinkedList.traverseFront();
		System.out.println("Size is: " + dbLinkedList.size);

	}

}
