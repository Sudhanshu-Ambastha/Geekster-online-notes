import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findMissingAndRepeating(arr, n);
    }

    public static void findMissingAndRepeating(int[] arr, int n) {
        int[] count = new int[n + 1];
        int repeating = 0;
        for (int i = 0; i < n; i++) {
            if (count[arr[i]] == 1) {
                repeating = arr[i];
            }
            count[arr[i]]++;
        }
        int missing = 0;
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
                break;
            }
        }
        System.out.println(repeating);
        System.out.println(missing);
    }
}