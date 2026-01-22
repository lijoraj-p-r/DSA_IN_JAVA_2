package com.Dsjava.Array;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
		}
		System.out.println("key enter: ");
		sc.nextLine();
		int key = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("the index is " + i);
			found = true;
			break;
			}
		}
		if (found == false)
			System.out.println("not found");

	}

}
