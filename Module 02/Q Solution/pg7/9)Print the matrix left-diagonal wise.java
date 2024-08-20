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

        leftDiagonal(arr, n);
    }

    public static void leftDiagonal(int[][] arr, int n) {
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0, j = gap; j >= 0; i++, j--) {
                System.out.print(arr[i][j] + " ");
            }
        }
        for (int gap = 1; gap < n; gap++) {
            for (int i = gap, j = n - 1; i < n; i++, j--) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}