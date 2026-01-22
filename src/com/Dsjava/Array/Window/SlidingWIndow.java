package com.Dsjava.Array.Window;

public class SlidingWIndow {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 8};
		int target = 3;
		System.out.print("Array: " + maxSumSubarray(arr, target));		
	}
	
	public static int maxSumSubarray(int[] arr,int k) {
		
		int maxSum = 0, windowSum = 0;
		for ( int i=0; i <= k; i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;	
		for (int i = k; i < arr.length; i++) {
			windowSum += arr[i] - arr[i - k];		
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;	
	}
}
