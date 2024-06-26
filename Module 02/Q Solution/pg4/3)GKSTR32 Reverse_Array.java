import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, n);
    }

    public static void reverseArray(int[] arr, int n) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--; // Fix: Decrement j
        }
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp; // Fix: Swap using a temporary variable
    }
}