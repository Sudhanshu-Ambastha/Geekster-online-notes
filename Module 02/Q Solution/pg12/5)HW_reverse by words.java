import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String reversedString = reverseWords(str);
        System.out.println(reversedString);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            char[] wordChars = words[i].toCharArray();
            int start = 0;
            int end = wordChars.length - 1;

            while (start < end) {
                char temp = wordChars[start];
                wordChars[start] = wordChars[end];
                wordChars[end] = temp;
                start++;
                end--;
            }

            result.append(new String(wordChars));
            result.append(" ");
        }

        return result.toString().trim();
    }
}