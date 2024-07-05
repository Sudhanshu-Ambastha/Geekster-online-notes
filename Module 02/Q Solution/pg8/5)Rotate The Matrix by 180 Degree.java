import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        rotate90(arr, n);
        rotate90(arr, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void rotate90(int[][] arr, int n) {
        // step1 - transpose
        transpose(arr, n);
        // step2 - reverse each row
        reverseEachRow(arr, n);
    }

    public static void reverseEachRow(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            int si = 0;
            int ei = n - 1;
            while (si < ei) {
                swap(arr[i], si, ei);
                si++;
                ei--;
            }
        }
    }

    public static void swap(int[] arr1d, int i, int j) {
        int temp = arr1d[i];
        arr1d[i] = arr1d[j];
        arr1d[j] = temp;
    }

    public static void transpose(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }
}