package com.Dsjava.Array.sorting.insertion;

public class InsertionSort {

	public static void main(String[] args) {
		// InsertionSortDemo.java
		// Goal: Sort an integer array using Insertion Sort with detailed step-by-step explanation.

		        // Sample input array (unsorted)
		        int[] arr = {10, 3, 5, 2, 7, 1};

		        // Print the array before sorting
		        System.out.print("Before: ");
		        printArray(arr);

		        // Call insertion sort
		        insertionSort(arr);

		        // Print the array after sorting
		        System.out.print("After : ");
		        printArray(arr);
		    }
		    /**
		     * Sorts the array in ascending order using Insertion Sort.
		     * Insertion Sort is stable and in-place.
		     * Time: O(n^2) worst/average, O(n) best (already sorted)
		     * Space: O(1)
		     */
		    static void insertionSort(int[] a) {
		        // Guard: if array is null or has 0/1 element, nothing to do
		        if (a == null || a.length < 2) return;

		        // Outer loop: i marks the boundary between sorted [0..i-1] and unsorted [i..end]
		        for (int i = 1; i <= a.length-1; i++) {
		            // key = element we want to insert into the sorted part
		            int key = a[i];
		            // j = index of the last element in the current sorted part
		            int j = i - 1;

		            // (Optional) Debug print: show pass header
		            System.out.println("\n-- Pass i=" + i + " (key=" + key + ") --");

		            // While we are not out of bounds AND the element at j is greater than key,
		            // shift a[j] one position to the right to make space for key.
		            while (j >= 0 && a[j] > key) {
		                // Shift: move the larger element right by one step
		                a[j + 1] = a[j];

		                // (Optional) Debug print: show the shift action
		                // Example: "Shift 10 from index 0 to index 1"
		                System.out.println("Shift " + a[j] + " from index " + j + " to index " + (j + 1));

		                // Move j left to continue checking previous elements
		                j--;
		            }

		            // Insert the key at its correct position (j stopped at the element < key, or -1)
		            a[j + 1] = key;
		            // (Optional) Debug print: show where key landed and the current state of array
		            System.out.println("Insert key " + key + " at index " + (j + 1));
		            System.out.print("Array now: ");
		            printArray(a);
		        }
		    }

		    // Utility method to print the array on one line
		    static void printArray(int[] a) {
		        System.out.print("[");
		        for (int i = 0; i < a.length; i++) {
		            System.out.print(a[i]);
		            if (i != a.length - 1) System.out.print(", ");
		        }
		        System.out.println("]");
		    }
		}


	


