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
        int target = scn.nextInt();

        System.out.println(searchInsertPosition(arr, n, target));

    }

    public static int searchInsertPosition(int[] arr, int n, int target) {
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                i = mid + 1;
            } else if (arr[mid] > target) {
                j = mid - 1;
            }
        }
        return i;
    }
}