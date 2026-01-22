package com.Dsjava.Array.sorting.bubbletry;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
int[] a = {10,30,20,40,50,60};
int n = a.length;
for (int i = 0; i < n - 1 ; i++) {
	for (int j = 0; j <= n - i - 2; j++) {
		if(a[j] > a[j + 1]) {
			int temp = a[j];
			a[j] = a[j + 1];
			a[j+1] = temp;
		}
	}
}
System.out.println("Sorted array is "+ Arrays.toString(a));
	}

}
