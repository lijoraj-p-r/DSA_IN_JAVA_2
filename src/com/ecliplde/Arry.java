package com.ecliplde;
import java.util.Scanner;

public class Arry {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
System.out.println("Enter arry size: ");
 
	int[] a = new int[sc.nextInt()];
	System.out.println(a.length);
	
	for (int i = 0;i <=  a.length -1 ;i++ ) {
		System.out.print("Enter element to store at memory location " + i);
		a[i] = sc.nextInt();
	
	}

	
	System.out.println("arryu using loop");
	for(int  i=0; i<=a.length-1; i++ ){
		System.out.println(a[i]);// i = 0
		
	}

	}

}
