package com.Dsjava.String.compresing;

public class UsingWhile {
	public static void main(String[] args) {
	        String s = "aaabbbcccc";

	        char a = s.charAt(0);
	        int rep = 1;  // Fix 1: Start from 1
	        String s2 = "";

	        for (int i = 1; i < s.length(); i++) {
	            char b = s.charAt(i);  // Fix 2: Get current character from loop

	            if (a == b) {
	                rep++;
	            } else {
	                s2 += a + "" + rep;
	                rep = 1;  // Reset count
	                a = b;    // Move forward
	            }
	        }
	        // Add last group
	        s2 += a + "" + rep;
	        System.out.println(s2);
	    }
	}