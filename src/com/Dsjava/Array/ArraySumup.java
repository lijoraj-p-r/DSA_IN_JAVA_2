package com.Dsjava.Array;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class ArraySumup {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int target = 20;
        SelectionSort(arr);
        sumfinder(arr, target);
        
        
    }
public static void SelectionSort(int[] arr) {
        // Selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
            // Swap after finding the minimum in the rest of the array
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        for (int x : arr) {
            System.out.print(x + " ");
        }
}
//Array.sort
public static void sumfinder(int[] arr, int target) {
	for(int i=0; i<= arr.length-target; i++) {
		for (int j=i+1; j<= arr.length-target-1; j++) {
			int left = j+1;
			int right = arr.length-2;
			while (left < right) {
				if (arr[i]+arr[j]+arr[left]+arr[right] == target) {
					System.out.println(""+ arr[i]+", "+arr[j]+", "+arr[left]+", "+arr[right]);
					
				}
			}
		}
	}
}
}
 
