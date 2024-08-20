import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        String result = findPalindromicString(words);

        System.out.println(result);
    }

    public static String findPalindromicString(String[] words) {
        for (String word : words) {
            if (isPalindromic(word)) {
                return word;
            }
        }

        return "empty";
    }

    public static boolean isPalindromic(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}