package com.DoublyCirclurLinkedList;

public class CircularDoublyLinkedList {
	Node head, tail;

	CircularDoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		newNode.prev = tail;
		newNode.next = head;
		tail.next = newNode;
		head.prev = newNode;
		tail = newNode;
	}

	void travelforward() {
		if (head == null) {
			System.out.println("Empty set");
			return;
		}

		Node temp = head;
		while (temp.next != head && head.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print(temp.data+"\n");
	}

	void printBackWard() {
		if (head == null) {
			System.out.println("Empty set");
			return;
		}
		Node temp = tail;
		while (temp.prev != tail && head.prev != null) {
			System.out.print(temp.data + "->");
			temp = temp.prev;
		}
		System.out.print(temp.data);

	}
}
