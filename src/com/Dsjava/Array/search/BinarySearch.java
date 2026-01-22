package com.Dsjava.Array.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] elements = new int[10];
		int[] elements = {0,10,20,30,40,50,60,70,80,90};
		int first = 0;
		int last = elements.length - 1;
		int mid = (first + last)/2;
		int key = 60; //search element
		while (first <= last) {
			if(key == elements[mid]) {
				System.out.println("Element found mid" + elements[mid]);
				return;
			} else if (key > elements[mid]) {
				first = mid + 1;
				
			} else if (key < elements[mid]) {
				last = mid -1;
			}
			mid =  (first + last )/2;
		} System.out.println("Element not found");

	}

}
