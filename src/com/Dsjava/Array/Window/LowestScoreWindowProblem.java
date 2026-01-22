package com.Dsjava.Array.Window;

import java.util.Arrays;
import java.util.Scanner;

public class LowestScoreWindowProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = {2, 4, 1, 8, 6, 7, 3};
        int k = 4;

        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(scores);
        for (int i = 0; i <= scores.length - k; i++) {
            int max = scores[i];
            int min = scores[i];

            for (int j = i; j < i + k; j++) {
                if (scores[j] > max) max = scores[j];
                if (scores[j] < min) min = scores[j];
            }

            int diff = max - min;
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        System.out.println("Minimum Difference: " + minDiff);
    }
}
