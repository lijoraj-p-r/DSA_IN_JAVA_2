package com.Dsjava.String;

public class StringRotionFInderTwoString {

	public static void main(String[] args) {
		
		String str1 = "HelloWorld";
		String str2 = "WorldHello";
		
		String str3 = str1 + str1;
		System.out.println(str3);
		System.out.println(str3.contains(str2));
	}

}
