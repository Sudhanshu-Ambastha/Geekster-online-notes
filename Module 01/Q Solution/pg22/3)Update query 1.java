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

        int left = scn.nextInt();
        int right = scn.nextInt();
        int x = scn.nextInt();

        int[] ans = updateQuery(arr, n, left, right, x);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] updateQuery(int[] arr, int n, int left, int right, int x) {

        for (int i = left; i <= right; i++) {
            arr[i] = x;
        }
        return arr;
    }
}