package com.Dsjava.Array.search;

public class TwoPointer {

	public static void main(String[] args) {
int[] arr = {10, 20, 30, 40, 50, 60, 80, 90};
int key = 60;
int left = 0;
int right = arr.length-1;

int iteration = 1;
while (left < right){
	System.out.println(iteration);
	if (key == arr[left] || key == arr[right]) {
		if (key == arr[right]) {
		System.out.println("key found from right at position " + (right+1));
		return;		
		} else {
			System.out.println("key found  left at position " + (left+1));

		}
	}
	iteration++;
	left++;
	right--;
}
System.out.println("key not present");
}
	}

