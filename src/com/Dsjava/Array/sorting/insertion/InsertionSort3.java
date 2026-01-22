package com.Dsjava.Array.sorting.insertion;

public class InsertionSort3 {

	public static void main(String[] args) {
	int[] arr = {30, 40, 20, 30, 10, 50, 70};
	
	InsertionSort(arr);
	}
	//insertion Sort
	public static void InsertionSort(int[] arr) {
		
		// outer loop to travse from unsroted array
		//strat from 1 because we intialy consider the first element as sorted so that  
		// compare back wards
		for (int i =1; i <= arr.length-1; i++) {
			int key = arr[i]; //current card in my hand to sort
			int j = i + 1; // it is hold the index of last sorted elemnt;
			while(j <= arr.length-1 && arr[j] < key) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j++;
			}
		}
		
		for (int x: arr) {
			System.out.print( x + " ");
		}
	}

}
