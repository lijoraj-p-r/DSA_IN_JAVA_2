package com.Dsjava.Array.search;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10};

        int n = arr1.length + arr2.length;
        int[] arr3 = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - arr1.length]; // correct indexing
            }
            System.out.println(arr3[i]);
        }
    }
}
