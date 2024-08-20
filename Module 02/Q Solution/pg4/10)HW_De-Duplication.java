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
        System.out.println(deDuplicate(arr, n));
    }

    public static int deDuplicate(int[] arr, int n) {
        if (arr.length <= 2) {
            return arr.length;
        }

        int j = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                arr[j++] = arr[i];
            }
        }

        return j;
    }
}