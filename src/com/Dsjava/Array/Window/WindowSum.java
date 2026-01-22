package com.Dsjava.Array.Window;

public class WindowSum {

	public static void main(String[] args) {
		int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
		int windowSize = 3;
		WindowDistinct(arr, windowSize);

	}
	
	public static void WindowDistinct(int[] arr, int windowSize) {
		int maxSum = 0, windowSum = 0;
		for (int i = 0; i <= windowSize; i++) {
			windowSum += arr[i];
		}
		
		maxSum = windowSum;
		
		for (int i = windowSize+1; i <= arr.length-1; i++) {
			if (arr[i] != arr[i -1]) {
			windowSum = windowSum + arr[i] - arr[i - windowSize];
			maxSum = Math.max(maxSum, windowSum);
			System.out.println(maxSum + " windowSum " + windowSum);
			}
		}
	
		
	}
}
	
	