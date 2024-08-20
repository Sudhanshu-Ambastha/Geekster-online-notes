import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int result = longestPalindromeLength(str);
        System.out.println(result); // Output the result
    }

    public static int longestPalindromeLength(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOddCount = false;

        // Calculate the length of the longest palindrome
        for (int count : charCountMap.values()) {
            if (count % 2 == 0) {
                length += count; // If the count is even, use all characters
            } else {
                length += count - 1; // If the count is odd, use the largest even number
                hasOddCount = true; // We found at least one character with an odd count
            }
        }

        // If there was any character with an odd count, we can place one odd character
        // in the middle
        if (hasOddCount) {
            length += 1;
        }

        return length;
    }
}