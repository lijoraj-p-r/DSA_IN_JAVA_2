package com.Dsjava.prefixSum;

import java.util.Scanner;

public class FindPrefixSum {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int[] arr = new int[sc.nextInt()];
for (int i=0; i <= arr.length-1; i++) {
	arr[i] = sc.nextInt();
}

int[] arr2 = new int[arr.length];
arr2[0] = arr[0];

for (int i=1; i <= arr.length-1; i++) {
	arr2[i] = arr[i] + arr2[i-1];
}

for (int i: arr2) {
	System.out.print(i + " ");
}



	}

}
