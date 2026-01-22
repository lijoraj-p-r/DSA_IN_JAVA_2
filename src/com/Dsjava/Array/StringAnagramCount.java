package com.Dsjava.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAnagramCount {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String p = br.readLine();
		
		System.out.println( anagramFinder(s, p));
		
	}
	
	public static int anagramFinder(String s, String p) {
		int sLen = s.length() , pLen = p.length();
		if(pLen > sLen ) return 0;
		int freqS[] = new int[26];
		int freqP[] = new int[26];
		
		for ( int i = 0; i < pLen; i++) {
			freqS[s.charAt(i)-'a']++;
			freqP[p.charAt(i)-'a']++;
		}
		int count = 0;
		if (equalCheck(freqS, freqP)) {
			count++;
		}
		
		for (int i = pLen; i < sLen; i++) {
			freqS[s.charAt(i-pLen)-'a']--;
			freqS[s.charAt(i)-'a']++;
			
			if (equalCheck(freqS, freqP)) {
				count++;
			}
			
			
		}
		
		
		return count;
	}
	
	public static boolean equalCheck(int[] arr1, int[] arr2) {
		
		for(int i = 0; i <= arr1.length-1; i++) {
			
			if(arr1[i] != arr2[i]) {
				
				return false;
			}
		}
		return true;
	}

}
