package com.Dsjava.Array.sorting;

public class SelctionsortS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 0, 5};
		
		for (int i = 0; i <= arr.length-2; i++) {
			int minIndex = i;
			for (int j = i +1; j <= arr.length-1; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;	
			}
		}
		for(int x: arr ) {
			System.out.print(x+ " ");
		}

	}

}
