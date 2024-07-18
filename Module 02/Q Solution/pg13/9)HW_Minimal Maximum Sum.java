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
        int k = scn.nextInt();
        int result = splitArray(arr, k);
        System.out.println(result);
    }

    public static int splitArray(int[] arr, int k) {
        int i = 0;
        int j = 0;
        for (int num : arr) {
            i = Math.max(i, num);
            j += num;
        }

        while (i < j) {
            int mid = i + (j - i) / 2;
            if (isValid(arr, k, mid)) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

    public static boolean isValid(int[] arr, int k, int target) {
        int count = 1;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > target) {
                count++;
                sum = num;
                if (count > k) {
                    return false;
                }
            }
        }
        return true;
    }
}