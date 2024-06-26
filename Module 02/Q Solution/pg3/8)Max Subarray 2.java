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
        System.out.println(maxSumSubarray(arr, n));
    }

    public static int maxSumSubarray(int[] arr, int n) {
        int sumSoFar = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (sumSoFar < 0) {
                sumSoFar = arr[i];
            } else {
                sumSoFar += arr[i];
            }

            if (sumSoFar > maxSum) {
                maxSum = sumSoFar;
            }
        }
        return maxSum;
    }
}