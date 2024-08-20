import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        int n = scn.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.next().charAt(0);
        }
        greaterChar(arr, n, ch);
    }

    public static void greaterChar(char[] arr, int n, char ch) {
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == ch) {
                i = mid + 1;
            } else if (arr[mid] < ch) {
                i = mid + 1;
            } else if (arr[mid] > ch) {
                j = mid - 1;
            }
        }
        if (i == n) {
            System.out.println("-1");
        } else {
            System.out.println(arr[i]);
        }
    }
}