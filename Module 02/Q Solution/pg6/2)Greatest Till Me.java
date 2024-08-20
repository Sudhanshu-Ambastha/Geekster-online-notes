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
        greaterTillMe(arr, n);
    }

    public static void greaterTillMe(int[] arr, int n) {
        int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = Math.max(arr[i], pre[i - 1]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(pre[i]);
        }
    }
}