import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] B = new int[M];

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        int[] mergedArray = mergeArrays(A, B);

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }

        while (i < n) {
            merged[k++] = A[i++];
        }

        while (j < m) {
            merged[k++] = B[j++];
        }

        return merged;
    }
}