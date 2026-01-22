
public class CircularLinkedList {

	class Node{
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	Node head, tail;
	
	CircularLinkedList() {
		head = tail = null;
	}
	
	void insertAtBegning(int data) {
		Node newNode = new Node(data);
		if(head == null) 
		{
			head = tail = newNode;
			tail.next = head;
			return;
		}
		newNode.next = head;
		head = newNode;
		tail.next = head;
	}
	
	void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			tail.next = head;
			return;
		}
		tail.next = newNode;
		tail = newNode;
		tail.next = head;
	}
	
	
	void DisplayCLSForward() {
		if(head == null) {
			System.out.println("Empty");
		}
		
		Node current = head;
		while(current.next != head) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.print(current.data + "\n");
	
	}
}
