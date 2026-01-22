package com.Dsjava.String;
import java.util.Scanner;

public class FirstLetterCapitalise {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String str = scanner.nextLine();

	        String[] arr = str.split(" ");

	        // Create a StringBuilder to build the updated sentence efficiently
	        StringBuilder updatedSentence = new StringBuilder();

	        // Loop through each word in the array
	        for (int i = 0; i < arr.length; i++) {
	            String word = arr[i]; // Get the current word

	            // Only process non-empty words (in case of extra spaces)
	            if (!word.isEmpty()) {
	                // Get the first character and convert it to uppercase
	                char firstChar = Character.toUpperCase(word.charAt(0));

	                // Get the rest of the word starting from index 1 (if it exists)
	                String rest = word.length() > 1 ? word.substring(1) : "";

	                // Append the capitalized word to the updated sentence
	                updatedSentence.append(firstChar).append(rest);
	            }

	            // If it's not the last word, add a space after the word
	            if (i < arr.length - 1) {
	                updatedSentence.append(" ");
	            }
	        }

	        // Print the final sentence with capitalized words
	        System.out.println(updatedSentence.toString());

	        // Close the scanner to free system resources
	        scanner.close();
	    }
	}


