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
        System.out.println(findSingleElement(arr));
    }

    public static int findSingleElement(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int mid = (j + i) / 2;

            if (mid % 2 == 1) {
                mid--; // Ensure we look at even indices
            }

            if (arr[mid] == arr[mid + 1]) {
                i = mid + 2;
            } else {
                j = mid;
            }
        }

        return arr[i];
    }
}