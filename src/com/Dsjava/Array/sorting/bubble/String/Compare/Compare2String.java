package com.Dsjava.Array.sorting.bubble.String.Compare;

public class Compare2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "python";
		System.out.println(s1.compareTo(s2));

		
		String s3 = "Java";
		String s4 = "Java";
		System.out.println(s3.compareTo(s4));
		

		
		String s5 = "Java";
		String s6 = "Javab";
		System.out.println(s5.compareTo(s6));
		
		if(s1.compareTo(s2) > 0) {
   System.out.println("1st is biggger");
		}
	}
}
