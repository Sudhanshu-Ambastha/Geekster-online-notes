import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean isPalindrome = checkPalindrome(str);
        System.out.println(isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        // Convert to lowercase and remove non-alphanumeric characters
        String cleanedStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Check if cleanedStr is a palindrome
        int left = 0;
        int right = cleanedStr.length() - 1;
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}