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

        int result = findLucky(arr);
        System.out.println(result);
    }

    public static int findLucky(int[] arr) {
        int maxLucky = -1;
        for (int i = 1; i <= 10; i++) {
            int frequency = 0;
            for (int num : arr) {
                if (num == i) {
                    frequency++;
                }
            }
            if (frequency == i) {
                maxLucky = Math.max(maxLucky, i);
            }
        }
        return maxLucky;
    }
}