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
        System.out.println(findRotationIndex(arr, n));
    }

    public static int findRotationIndex(int[] arr, int n) {
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return mid - 1;
            } else if (arr[mid] <= arr[j]) {
                j = mid - 1;
            } else if (arr[mid] >= arr[i]) {
                i = mid + 1;
            }
        }

        return -1;
    }
}