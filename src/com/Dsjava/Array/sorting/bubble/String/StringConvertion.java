package com.Dsjava.Array.sorting.bubble.String;
import java.util.Arrays;
import java.util.Scanner;
public class StringConvertion {
	
	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner sc = new Scanner(System.in);

	        // Ask user to enter the size of the array
	        System.out.print("Please enter array size: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // Consume the leftover newline

	        // Declare a String array of size 'n'
	        String[] a = new String[n];

	        // Ask user to enter the array elements
	        System.out.println("Please enter array elements: ");
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextLine(); // Read each string input
	        }

	        // Print the original (unsorted) array
	        System.out.println("Original array: " + Arrays.toString(a));

	        // Perform bubble sort on the array
	        for (int i = 0; i <= n - 2; i++) {
	            for (int j = 0; j <= n - 2 - i; j++) {
	                // Compare adjacent elements using compareTo (for strings)
	                if (a[j].compareTo(a[j + 1]) > 0) {
	                    // Swap if out of order
	                    String temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
	                }
	            }
	        }

	        // Print the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(a));
	    }
	}
