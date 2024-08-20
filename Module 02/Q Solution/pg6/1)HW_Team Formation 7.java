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

    public static int uniqueSum(int[] arr, int n) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] + arr[n - i - 1] != arr[0] + arr[n - 1]) {
                return -1;
            }
            sum += arr[i] * arr[n - i - 1];
        }
        return sum;
    }
}