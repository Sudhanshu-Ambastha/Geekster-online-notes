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
        sort012(arr, n);
    }

    public static void sort012(int[] arr, int n) {
        int i = 0;
        int j = 0;
        int k = n - 1;
        while (j <= k) {
            if (arr[j] == 1) {
                j++;
            } else if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[j] == 2) {
                swap(arr, j, k);
                k--;
            }
        }

        // print
        for (int a = 0; a < n; a++) {
            System.out.print(arr[a] + " ");
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}