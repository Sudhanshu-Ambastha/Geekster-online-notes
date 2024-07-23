import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] B = new int[n];
        for (int i = 0; i < m; i++) {
            B[i] = scn.nextInt();
        }
        mergeArrays(A, B, n, m);
    }

    public static void mergeArrays(int[] A, int[] B, int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (A[i] < B[j]) {
                ans.add(A[i]);
                i++;
            } else {
                ans.add(B[j]);
                j++;
            }
        }
        while (i < n) {
            ans.add(A[i]);
            i++;
        }
        while (j < m) {
            ans.add(B[j]);
            j++;
        }

        int idx = 0;
        while (idx < ans.size() - 1) {
            if (ans.get(idx) == ans.get(idx + 1)) {
                ans.remove(idx);
            } else {
                idx++;
            }
        }
        for (Integer x : ans) {
            System.out.print(x + " ");
        }
    }
}