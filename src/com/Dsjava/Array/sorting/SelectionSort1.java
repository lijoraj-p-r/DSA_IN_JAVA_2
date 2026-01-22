package com.Dsjava.Array.sorting;

public class SelectionSort1 {

	public static void main(String[] args) {
		        // Example array to sort
		        int[] numbers = {5, 3, 8, 1, 4};

		        // Call the selection sort method
		        selectionSort(numbers);

		        // Print the sorted array
		        System.out.print("Sorted array: ");
		        for (int num : numbers) {
		            System.out.print(num + " ");
		        }
		    }

		    // Method to perform selection sort
		    public static void selectionSort(int[] arr) {
		        int n = arr.length;

		        // Outer loop - goes through each position in the array
		        for (int i = 0; i < n - 1; i++) {

		            // Step 1: Assume the current position has the smallest value
		            int minIndex = i;

		            // Step 2: Look through the rest of the array to find the actual smallest number
		            for (int j = i + 1; j < n; j++) {
		                // If a smaller number is found, update minIndex
		                if (arr[j] < arr[minIndex]) {
		                    minIndex = j;
		                }
		            }

		            // Step 3: Swap the smallest found number with the number at the current position
		            if (minIndex != i) {
		                int temp = arr[i];
		                arr[i] = arr[minIndex];
		                arr[minIndex] = temp;
		            }

		            // Optional: Print array after each pass to see progress
		            System.out.print("After step " + (i + 1) + ": ");
		            for (int num : arr) {
		                System.out.print(num + " ");
		            }
		            System.out.println(); // New line for next step
		        }
		    }
		}



