import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] ans = printRowWiseWithCondition(arr, m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] printRowWiseWithCondition(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            if (i % 2 != 0) {
                int si = 0;
                int ei = n - 1;
                while (si < ei) {
                    swap(arr[i], si, ei);
                    si++;
                    ei--;
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int si, int ei) {
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
    }
}