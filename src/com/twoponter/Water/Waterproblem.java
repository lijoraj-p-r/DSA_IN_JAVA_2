package com.twoponter.Water;

public class Waterproblem {

	public static void main(String[] args) {
		int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int left = 0;
		int right = arr.length-1;
		int max = 0;

		while (left < right) {
			int length, width = right - left;
			if (arr[left] < arr[right]) {
				length = arr[left];
			} else {
				length = arr[right];
			}
			int area = length * width;
			if (area > max) {
				max = area;
			} 	else if (arr[left] < arr[right]) {
				left++;
				
			} else {
				right--;
			}
		} 
		System.out.println(max);

	}

}
