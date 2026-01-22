package com.Dsjava.Array.sorting;
import java.util.Scanner;

public class SelectionSortde {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arry size");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter arry elements: ");
		for (int i = 0; i <= arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		//outer loop responsible for traversing accross array
		for (int i = 0; i <= arr.length-1; i++) {	
			//current index to combare
			int minIndex = i;
			//inner loop for comparing the current elemnt to that of unselected elemnts
			for (int j = i +1; j <= arr.length-1; j++) {
				if (arr[j] > arr[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		System.out.print("[");
		for(int x: arr) {
			System.out.print(x + "  ");
		}
		System.out.print("]");
	}
}
