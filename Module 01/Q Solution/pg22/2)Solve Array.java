import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scn.nextInt();
        }

        int[] indexes = new int[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = scn.nextInt();
        }

        int[] ans = solveArray(n, numbers, indexes);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] solveArray(int n, int[] arr, int[] index) {
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            int idx = index[i];

            target[idx] = val;
        }
        return target;
    }
}