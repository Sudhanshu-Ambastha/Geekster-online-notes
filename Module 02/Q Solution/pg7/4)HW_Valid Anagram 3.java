import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the two strings
        String s = sc.nextLine();
        String t = sc.nextLine();

        // Check if the two strings are anagrams
        String result = checkAnagram(s, t);

        // Output the result
        System.out.println(result);

        sc.close();
    }

    public static String checkAnagram(String s, String t) {
        // Check if the length of the two strings are different
        if (s.length() != t.length()) {
            return "No";
        }

        // Convert the strings to char arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Sort the char arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare the sorted char arrays
        if (Arrays.equals(sChars, tChars)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
