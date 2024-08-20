import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printFreq(str);
    }

    public static void printFreq(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            if (freq[idx] > 0) {
                System.out.println(ch + "-" + freq[idx]);
                freq[idx] = 0;
            }
        }
    }
}