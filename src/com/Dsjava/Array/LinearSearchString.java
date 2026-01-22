package com.Dsjava.Array;
import java.util.Scanner;
public class LinearSearchString {

	public static void main(String[] args) {
		
		        // user input
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Please enter array size:");
		        int size = sc.nextInt();

		        // to consume extra next line
		        sc.nextLine();

		        String[] names = new String[size];
		        System.out.println("Please enter array elements (names): ");
		        for (int i = 0; i < size; i++) {
		            names[i] = sc.nextLine();
		        }

		        System.out.println("Please enter key to search: ");
		        String key = sc.nextLine();

		        // linear array traversal
		        for (int i = 0; i < size; i++) {
		            // comparison
		            if (names[i].equals(key)) {
		                System.out.println("Element found at index: " + i);
		                return;
		            }
		        }

		        System.out.println("Element not found!");
		        sc.close(); // Close the scanner to avoid resource leak
		    }
		}

