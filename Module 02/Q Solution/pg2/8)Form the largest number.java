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

        System.out.println(formLargestNumber(arr, n));
    }

    public static String formLargestNumber(int[] arr, int n) {
        String[] arr1 = new String[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.toString(arr[i]);
        }

        Arrays.sort(arr1, (a, b) -> {
            String str1 = a + b;
            String str2 = b + a;
            return str2.compareTo(str1);
        });

        String ans = "";
        for (int i = 0; i < n; i++) {
            ans = ans + arr1[i];
        }
        return ans;
    }
}