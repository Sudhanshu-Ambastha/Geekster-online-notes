import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] count = new int[100001];
        for (int i = 0; i < m; i++) {
            count[arr2[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (count[arr1[i]] == 2) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
