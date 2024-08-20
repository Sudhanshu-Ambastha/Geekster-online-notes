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

        System.out.println(middleIndex(arr, n));
    }

    public static int middleIndex(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            for (int k = i + 1; k < n; k++) {
                rightSum += nums[k];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}