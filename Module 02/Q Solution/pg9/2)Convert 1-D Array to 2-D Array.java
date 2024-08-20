import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1d = new int[n];
        for (int i = 0; i < n; i++) {
            arr1d[i] = scn.nextInt();
        }

        int p = scn.nextInt();
        int q = scn.nextInt();

        int[][] arr2d = convert1dto2d(arr1d, n, p, q);
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] convert1dto2d(int[] arr1d, int n, int p, int q) {
        int[][] arr2d = new int[p][q];
        for (int idx = 0; idx < n; idx++) {
            int i = idx / q;
            int j = idx % q;
            arr2d[i][j] = arr1d[idx];
        }
        return arr2d;
    }
}