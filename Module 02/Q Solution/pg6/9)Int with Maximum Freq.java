import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int result = maxFreq(arr);
        System.out.println(result);
    }

    public static int maxFreq(int[] arr) {
        int[] freq = new int[10];

        for (int num : arr) {
            freq[num]++;
        }

        int maxFreqDigit = 0;
        int maxFreq = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxFreqDigit = i;
            }
        }

        return maxFreqDigit;
    }
}