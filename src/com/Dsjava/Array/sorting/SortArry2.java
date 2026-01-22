package com.Dsjava.Array.sorting;

public class SortArry2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {45, 12, 78, 34, 23, 89, 67};
		for (int i = 0; i <= arr.length-1; i++) {
			int index = i;
			
			for (int j = i +1; j<= arr.length-1; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			
			if(index != i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		
		for (int x: arr) {
			System.out.print(x + " ");
		}

	}

}
