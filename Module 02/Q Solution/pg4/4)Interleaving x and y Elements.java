import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        interleavingXY(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void interleavingXY(int[] arr, int n) {
        int[] ans = new int[n];
        int i = 0;
        int j = n / 2;
        int k = 0;

        while (i < n / 2) {
            ans[k] = arr[i];
            i++;
            k++;

            ans[k] = arr[j];
            k++;
            j++;
        }

        for (int m = 0; m < n; m++) {
            arr[m] = ans[m];
        }
    }
}