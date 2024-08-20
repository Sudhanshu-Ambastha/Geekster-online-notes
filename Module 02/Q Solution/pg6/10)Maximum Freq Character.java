import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        char result = maxOccur(str);
        System.out.println(result);
    }

    public static char maxOccur(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty");
        }

        // Initialize an array to store the count of occurrences of each alphabet
        int[] count = new int[26]; // Assuming only small case alphabets

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch - 'a']++; // Increment the count of the corresponding alphabet
        }

        char maxChar = 'a';
        int maxCount = count[0];

        // Find the alphabet with maximum occurrence
        for (int i = 1; i < 26; i++) {
            if (count[i] > maxCount) {
                maxChar = (char) ('a' + i);
                maxCount = count[i];
            }
        }

        return maxChar;
    }
}