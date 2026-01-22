package com.doublyLinkedList;

public class Node {
	int data;
	Node nextNodeLocation;
	Node prevNodeLocation;
  Node(int data) {
	 this.data = data;
	 nextNodeLocation = null;
	 prevNodeLocation = null;
 }
}
