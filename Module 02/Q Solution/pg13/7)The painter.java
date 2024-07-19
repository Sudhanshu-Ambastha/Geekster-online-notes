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
        int painters = scn.nextInt();
        System.out.println(thePainters(arr, n, painters));
    }

    public static int thePainters(int[] arr, int n, int painters) {
        int si = max(arr);
        int ei = sum(arr);
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (check(arr, mid) > painters) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return si;
    }

    public static int check(int[] arr, int time) {
        int painters = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > time) {
                painters++;
                sum = arr[i];
            }
        }
        return painters;
    }

    public static int max(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }

    public static int sum(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans + arr[i];
        }
        return ans;
    }
}