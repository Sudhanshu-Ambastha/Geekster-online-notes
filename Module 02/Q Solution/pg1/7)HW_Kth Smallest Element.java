import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int kthSmallestElement = findKthSmallestElement(arr, k);
        System.out.println(kthSmallestElement);
    }

    public static int findKthSmallestElement(Integer[] arr, int k) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the kth smallest element
        return arr[k - 1];
    }
}