import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeArrays(arr1, n, arr2, m);
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int arr1[], int n, int arr2[], int m) {
        int i = 0;
        int j = 0;
        int k = 0;
        int ans[] = new int[n + m];

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                k++;
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < n) {
            ans[k] = arr1[i];
            k++;
            i++;
        }

        while (j < m) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;
    }
}