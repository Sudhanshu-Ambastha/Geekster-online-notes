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

        int[] prefixArray = prefixArray(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(prefixArray[i]);
        }
    }

    public static int[] prefixArray(int[] arr, int n) {
        int[] prefixArray = new int[n];
        prefixArray[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixArray[i] = Math.min(prefixArray[i - 1], arr[i]);
        }

        return prefixArray;
    }
}
