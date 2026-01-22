package com.doublyLinkedList;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		
		DoublyLinkedList2 doublyLinkedList = new DoublyLinkedList2();
		doublyLinkedList.insertAtFront(10);
		doublyLinkedList.insertAtFront(20);
		doublyLinkedList.insertAtFront(30);

		doublyLinkedList.insertAtFront(40);

		doublyLinkedList.insertAtFront(50);

		doublyLinkedList.insertAtFront(60);
		doublyLinkedList.insertAtFront(10);
		doublyLinkedList.insertAtRear(20);
		doublyLinkedList.insertAtRear(30);
		doublyLinkedList.insertAtRear(40);
		
		
		System.out.print("Print forward: ");
		//doublyLinkedList.printForword();
		System.out.println();
		//doublyLinkedList.swapNodesNtime();
		System.out.print("Print forward  swaped: ");
		doublyLinkedList.printForword();
		System.out.println();
		doublyLinkedList.printReverse();

	}

}
