package com.Dsjava.Array.sorting.bubble;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {		
		/*int[] a = {10, 20 , 30, 60, 50, 40};
		*/
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number of elements");
		int num = sc.nextInt();
		int[] a = new int[num];
		sc.nextLine();
		
		System.out.println("Enter array elements");
		for(int i = 0 ;i < num; i++) {
			a[i] = sc.nextInt();
		}
		int n = a.length;
		
		 System.out.println("unSorted array is "+ Arrays.toString(a));
 for (int i = 0;i <= n - 2;i++) {
		for (int j = 0; j <= n-2 - i; j++) {
			if (a[j ] > a[j + 1]) {
				int temp = a[j] ;
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
		}
	/*for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}*/
 System.out.println("Sorted array is "+ Arrays.toString(a));

	}

}
