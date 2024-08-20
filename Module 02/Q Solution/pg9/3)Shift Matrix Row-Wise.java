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
        int k = scn.nextInt();
        shiftMatrixRowwise(arr, n, k);
    }

    public static void shiftMatrixRowwise(int[][] arr, int n, int k) {
        k = -1 * k;

        for (int i = 0; i < n; i++) {
            k = k + n;
            k = k % n;
            reverse(arr[i], n - k, n - 1);
            reverse(arr[i], 0, n - k - 1);
            reverse(arr[i], 0, n - 1);
        }

        // Printing the shifted matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}