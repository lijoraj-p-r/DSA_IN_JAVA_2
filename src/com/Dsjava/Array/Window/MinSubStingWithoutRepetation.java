package com.Dsjava.Array.Window;

public class MinSubStingWithoutRepetation {

	public static void main(String[] args) {
		String str = "abbcbaba";
		
		int[] CharDatabase = new int[256];
		
		int left = 0;
		int right = 0;
		
		int maxLength = 0;
		
		while (right < str.length()-1) {
			int rightAcii = str.charAt(right);
			
			if (CharDatabase[rightAcii] == 0) {
				CharDatabase[rightAcii]++;
				maxLength = Math.max(maxLength, right - left +1);
				right++;
			} else {
				int leftAscii = str.charAt(left);
				CharDatabase[leftAscii]--;
				left++;	
			}
		}
		
		System.out.println("Current max length: " + maxLength);
	}

}
