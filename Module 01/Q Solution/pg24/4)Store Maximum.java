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

        System.out.println(trap(arr, n));
    }

    public static int trap(int[] arr, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = Integer.MIN_VALUE;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > leftMax) {
                    leftMax = arr[j];
                }
            }
            int rightMax = Integer.MIN_VALUE;
            for (int j = i; j < n; j++) {
                if (arr[j] > rightMax) {
                    rightMax = arr[j];
                }
            }
            int ans = Math.min(leftMax, rightMax);
            int water = ans - arr[i];
            result += water;
        }
        return result;
    }
}