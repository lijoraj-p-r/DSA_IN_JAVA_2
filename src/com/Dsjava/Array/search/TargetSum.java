package com.Dsjava.Array.search;

public class TargetSum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5 ,6, 7, 8};
		int target = 5;
		int right = arr.length-1, left = 0;
		
while (left <= right) {
	int sum = arr[left] + arr[right];
	if (target == sum) {
		System.out.println("elemnt are "+arr[left] +" and "+ arr[right]);
		return;
	} else if (sum < target){
		left++;
	} else {
		right--;
	}
}

	System.out.println("not pair possible");

	}

}
