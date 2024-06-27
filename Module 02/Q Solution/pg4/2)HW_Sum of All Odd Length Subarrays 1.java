import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = getOddLengthSubarraySum(arr);
        System.out.println(result);

        scanner.close();
    }

    public static int getOddLengthSubarraySum(int[] arr) {
        int result = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int prefixSum = 0;
            int suffixSum = 0;

            for (int j = i; j < n; j++) {
                if ((j - i) % 2 == 0) {
                    prefixSum += arr[j];
                } else {
                    suffixSum += arr[j];
                }

                if ((j - i + 1) % 2 != 0) {
                    result += prefixSum + suffixSum;
                }
            }
        }

        return result;
    }
}