package com.Dsjava.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//	System.out.println("Input Size");
//	int n = Integer.parseInt(br.readLine());
//	LinkedList list = new LinkedList();
//	for(int i = 0; i < n; i++) {
//		
//		String[] arr = br.readLine().split(" ");
//		switch(arr[0] ) {
//		
//		case "head": System.out.println("it is head");
//		list.addAtHead( Integer.parseInt(arr[1]) );
//	
//		break;
//		
//        case "tail": System.out.println("it is tail");
//		list.addAtTail(Integer.parseInt(arr[1]) );
//
//		break;
//		
//        case "index": System.out.println("it is index");
//		list.addAtIndex(Integer.parseInt(arr[1]) , Integer.parseInt(arr[2]) );
//
//		break;
//		
//        case "get": System.out.println("it is get");
//		list.get(Integer.parseInt(arr[1]) );
//
//		break;
//		
//
//        case "delete": System.out.println("it is get");
//		list.deleteAtIndex(Integer.parseInt(arr[1]) );
//
//		break;
//		
//        case "print": System.out.println("Printing now");
//		list.traverse();
//		break;
//		
//        case "swap" : System.out.println("Swapping");
//        list.swap(Integer.parseInt(arr[1]) , Integer.parseInt(arr[2]) );
//		
//		}
//	}
	
	LinkedList list = new LinkedList();
	list.addAtHead(10);
	list.addAtHead(20);
	list.addAtHead(30);
	list.addAtHead(40);
	list.addAtHead(50);
	
	System.out.println("get data at 20: " + list.get(20));

	System.out.println("get data at 20: " + list.get(0));
	
	
	list.addAtTail(10);
	list.addAtTail(300);
	list.addAtIndex(2,300);
	list.deleteAtIndex(2);
	list.traverse();

	
	list.traverse();
	}

}
