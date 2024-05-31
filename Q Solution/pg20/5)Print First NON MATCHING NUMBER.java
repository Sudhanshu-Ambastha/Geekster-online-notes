import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scn.nextInt();
        }

        System.out.println(firstNonMatching(n, arr1, arr2));
    }

    public static int firstNonMatching(int n, int[] arr1, int[] arr2) {
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return i;
            }
        }
        return -1;
    }
}