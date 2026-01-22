package com.Dsjava.String;

public class ReplaceCharPreservingSpace {

    public static void main(String[] args) {
        String str = "I Love JAVA";

        char[] charArr = str.toCharArray();
        char[] finalArr = new char[charArr.length];

        // Step 1: Mark spaces in finalArr
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                finalArr[i] = ' ';
            }
        }

        // Step 2: Fill characters in reverse, skipping spaces
        int j = charArr.length - 1;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != ' ') {
                // Find next position in finalArr that is not a space
                while (finalArr[j] == ' ') {
                    j--;
                }
                finalArr[j] = charArr[i];
                j--;
            }
        }

        // Print result as a string, not an array
        System.out.println(new String(finalArr));
    }
}
