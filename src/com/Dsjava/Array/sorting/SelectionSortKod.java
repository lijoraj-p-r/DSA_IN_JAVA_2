package com.Dsjava.Array.sorting;

public class SelectionSortKod {
	public static void main(String[] args) {
int[] arr = {10, 20, 30, 40, 50};
selectionSort(arr);
for(int x: arr) {
	System.out.print(x +" ");
}
}
public static void selectionSort(int[] arr) {
		for (int i=0; i<= arr.length-1; i++) {
			int max = i;
			for (int j = i +1; j <= arr.length-1; j++) {
				if (arr[max] < arr[j]) {
					max = j;
				}
			}
			//swap
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i]= temp;
		}
	}
}
