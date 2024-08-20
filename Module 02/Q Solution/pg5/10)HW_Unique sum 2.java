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

        System.out.println(uniqueSum(arr, n));
    }

    public static int uniqueSum(int[] nums, int n) {
        int max = 100000;
        int[] freq = new int[max + 1];

        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }

        int sum = 0;

        for (int i = 0; i <= max; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }
}
