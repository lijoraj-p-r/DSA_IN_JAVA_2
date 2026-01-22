package com.Dsjava.Array.sorting.selection;

public class SelectionSort2 {

	public static void main(String[] args) {
		
		int[] a = {40, 50, 30, 60, 10, 20};
		
		int minIdx = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
			if (a[i] < a[minIdx]) {
				a[minIdx] = a[i];
				//minIdx = i ;
			}	
			}
		}
	}
}
