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
        System.out.println(maxProdSubarray(arr, n));
    }

    public static int maxProdSubarray(int[] arr, int n) {
        int maxProd = 1;
        int minProd = 1;
        int largestProduct = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int temp = maxProd;
            maxProd = Math.max(curr, Math.max(maxProd * curr, minProd * curr));
            minProd = Math.min(curr, Math.min(temp * curr, minProd * curr));

            largestProduct = Math.max(largestProduct, maxProd);
        }
        return largestProduct;
    }
}