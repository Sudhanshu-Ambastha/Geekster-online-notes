import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(uniqueFreq(str));
    }

    public static int uniqueFreq(String str) {
        int[] freq = new int[10];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - '0';
            freq[idx]++;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        return count;
    }
}