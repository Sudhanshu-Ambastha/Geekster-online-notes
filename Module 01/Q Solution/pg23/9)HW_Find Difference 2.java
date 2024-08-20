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

        int k = scanner.nextInt();
        scanner.close();

        findPairs(arr, n, k);
    }

    public static void findPairs(int[] arr, int n, int k) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    System.out.println(Math.min(arr[i], arr[j]) + " " + Math.max(arr[i], arr[j]));
                }
            }
        }
    }
}