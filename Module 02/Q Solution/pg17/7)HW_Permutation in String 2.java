import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Sample Input
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        // Function call to check for permutations
        boolean result = checkInclusion(s1, s2);
        System.out.println(result);
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> s1Count = new HashMap<>();
        Map<Character, Integer> s2Count = new HashMap<>();

        // Count frequency of characters in s1
        for (char c : s1.toCharArray()) {
            s1Count.put(c, s1Count.getOrDefault(c, 0) + 1);
        }

        // Initialize the sliding window for s2
        for (int i = 0; i < s1.length(); i++) {
            char c = s2.charAt(i);
            s2Count.put(c, s2Count.getOrDefault(c, 0) + 1);
        }

        // Function to compare the character counts
        if (matches(s1Count, s2Count)) {
            return true;
        }

        // Slide the window over s2
        for (int i = s1.length(); i < s2.length(); i++) {
            char newChar = s2.charAt(i);
            char oldChar = s2.charAt(i - s1.length());

            // Add the new character to the window
            s2Count.put(newChar, s2Count.getOrDefault(newChar, 0) + 1);
            // Remove the old character from the window
            s2Count.put(oldChar, s2Count.get(oldChar) - 1);
            if (s2Count.get(oldChar) == 0) {
                s2Count.remove(oldChar);
            }

            // Check if the current window matches s1Count
            if (matches(s1Count, s2Count)) {
                return true;
            }
        }

        return false;
    }

    // Helper function to check if two maps match
    private static boolean matches(Map<Character, Integer> count1, Map<Character, Integer> count2) {
        return count1.equals(count2);
    }
}