package com.Dsjava.String.compresing;

public class StringCompretion {

	public static void main(String[] args) {
		String s = "aaabbbcccc";
		
		//char[] xy = a.toCharArray();
		char a = s.charAt(0);
		char b = s.charAt(1);
System.out.println(a);
		int rep = 0;
		String s2 = "";
		for (int i = 0; i < s.length() -1; i++ ) {
			//System.out.println(s[i]);
			
			if(a == b) {
				rep++;
			}else if (a != b) {
				
				s2 += a+""+rep;
				rep = 1;
			}
			a = b ;
			b =  s.charAt(i+1);	
		}
		s2 += a+""+rep;

		System.out.println(s2);

	}

}
