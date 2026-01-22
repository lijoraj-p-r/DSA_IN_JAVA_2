package com.Dsjava.Strings;

public class StringCheckHeap {
	public static void main(String[] args) {
		// These Strings are created inside the JRE's heap memory.
		// More specifically, inside a special part of the heap called the "String Pool".
		// Strings in the pool are immutable (cannot be changed).
		// If two strings have the same value, they point to the same object in the pool.				        String s1 = "Rama";
		        String s2 = "Sita";
		        String s3 = "Rama" + "Sita";   // Compile-time constant
		        String s4 = "Rama" + "Sita";   // Compile-time constant
//ref eq string eq wil create inside stin pool
		        if(s3 == s4) {
		            System.out.println("References Are Equal");
		        } else {
		            System.out.println("References Are Unequal");
		        }

		        if(s3.equals(s4)) {
		            System.out.println("Strings Are Equal");
		        } else {
		            System.out.println("Strings Are Not Equal");
		        }
		    }
		}


