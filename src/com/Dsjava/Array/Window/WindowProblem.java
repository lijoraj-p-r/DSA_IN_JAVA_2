package com.Dsjava.Array.Window;

public class WindowProblem {

	public static void main(String[] args) {
int[] arr = {1, 2, 4, 3, 2};

	
int windows = 3;
int n = arr.length;
int windowSum = 0;
for (int i=0; i < windows; i++) {
	windowSum += arr[i];
}
int max = windowSum;
for (int i =  windows;i <= arr.length-1; i++  ) {
	 windowSum += arr[i] - arr[i -windows];
	if (windowSum > max) {
		max = windowSum;
	}
	
}
System.out.println(max);

	}

}
