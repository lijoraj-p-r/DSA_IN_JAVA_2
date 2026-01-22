package com.Dsjava.Array;

public class TotalSum4Digit {

	public static void main(String[] args) {
		
		int[] arr = {1 , 0, -1, 0, -2, 2};
		int target = 0;
		for (int i=0; i <= arr.length-1; i++) {
			int min = i;
			for (int j=i+1; j <= arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					min = j;
				}
			}
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;	
		}
		
		for (int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		//lijo
		for (int i=0; i<= arr.length-4;i++) {
			for (int j=i+1; j <= arr.length-3; j++) {
				int left = j+1;
				int right = arr.length-1;
				
				while (left < right) {
					int sum = arr[i] + arr[j] + arr[left]+ arr[right] ;
					if (sum == target) {
					System.out.println(arr[i] +" "+ arr[j] +" "+ arr[left]+" "+ arr[right]);
					left++;
					right--;
				} else if (sum > target) {
					right--;
				} else {
					left++;
				}
			}
		}
		}
		
System.out.println();
		for (int i: arr) {
			System.out.print(i + " ");
		}
		
	}
}

	
