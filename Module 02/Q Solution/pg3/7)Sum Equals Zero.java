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
        System.out.println(sumEqualsZero(arr, n));
    }

    public static boolean sumEqualsZero(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = checkSum(arr, i, j);
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int checkSum(int[] arr, int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += arr[i];
        }
        return sum;
    }
}