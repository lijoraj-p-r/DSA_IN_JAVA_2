package com.Dsjava.Array.sorting;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] element = {10,20,40,30,50,60,90,80,70};
		int[] sorted;
		int first = element[0];
		int second = element[1];
		int temp =0 ;
		for (int i = 0; i < element.length;i++) {
			if (first > second) {
				temp = first;
				first =second;
				second = temp;	
			}
		}

	}

}
