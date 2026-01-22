package com.Dsjava.Array.sorting;

public class ReturnWithIndex {

	public static void main(String[] args) {
int[] a = {40, 50, 30, 60, 10, 20};

int minIndx = 0;

for (int i = 1; i < a.length; i++) {
	if (a[i] < a[minIndx]) {
		a[minIndx] = a[i];
		minIndx = i;
	}
}
System.out.println("Min element = " + a[minIndx]);
System.out.println ( "Index of min elemnt = " + minIndx); 
	}

}
