package com.Dsjava.DiffString.functions;

import java.util.Scanner;
import java.util.Arrays;

public class StringFuctions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Length: " + s.length());

        if (s.length() > 1) {
            System.out.println("Character at index 1: " + s.charAt(1));
        } else {
            System.out.println("Input too short for charAt(1)");
        }

        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Equals 'length': " + s.equals("length"));
        System.out.println("EqualsIgnoreCase 'Length': " + s.equalsIgnoreCase("Length"));
        System.out.println("Contains 'length': " + s.contains("length"));
        System.out.println("Char Array: " + Arrays.toString(s.toCharArray()));
        sc.close();
    }
    
}
