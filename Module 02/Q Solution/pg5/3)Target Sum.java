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
        int target = scn.nextInt();
        targetSum(arr, n, target);
    }

    public static void targetSum(int[] arr, int n, int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                System.out.println(arr[i] + " " + arr[j]);
                // Skip duplicate elements
                while (i < j && arr[i] == arr[i + 1]) {
                    i++;
                }
                while (i < j && arr[j] == arr[j - 1]) {
                    j--;
                }
                i++;
                j--;
            }
        }
    }
}