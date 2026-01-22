package com.Dsjava.String;

import java.util.Scanner;

public class findFrequency {

	public static void main(String[] args) {

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.nextLine();
        System.out.println("Please enter a character: ");
        char ch = sc.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }
        System.out.println("Frequency = " + count);
    }

	}
