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
        System.out.println(peakIndex(arr, n));
    }

    public static int peakIndex(int[] arr, int n) {
        for (int i = 1; i < n - 1; i++) {
            int curr = arr[i];
            int left = arr[i - 1];
            int right = arr[i + 1];
            if (curr > left && curr > right) {
                return i;
            }
        }
        return -1;
    }
}