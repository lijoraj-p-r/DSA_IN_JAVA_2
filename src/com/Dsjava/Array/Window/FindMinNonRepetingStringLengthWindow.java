package com.Dsjava.Array.Window;
import java.util.*;


public class FindMinNonRepetingStringLengthWindow {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        System.out.println("Maximum Length Substring with Two Occurrences: " + findMaxSubstring(s));
	    }

	    public static int findMaxSubstring(String s) {
	        int[] freq = new int[256]; // ASCII character frequencies
	        int left = 0;
	        int maxLen = 0;

	        for (int right = 0; right < s.length(); right++) {
	            freq[s.charAt(right)]++;

	            // If any character appears more than twice, shrink the window
	            while (freq[s.charAt(right)] > 2) {
	                freq[s.charAt(left)]--;
	                left++;
	            }

	            maxLen = Math.max(maxLen, right - left + 1);
	        }

	        return maxLen;
	    }
	}
