package com.Dsjava.Array.sorting.insertion;

public class InsertionSort2 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 15, 40, 50, 5};
for (int i = 1; i<= arr.length-1; i++) {
	int key = arr[i];
	int j = i -1;
	while (j >= 0 && arr[j] > key) {
		arr[j+1] = arr[j];
		j--;
	}
    arr[j + 1] = key;
}

for (int x: arr) {
	System.out.print( x + " ");
}
	}

}
