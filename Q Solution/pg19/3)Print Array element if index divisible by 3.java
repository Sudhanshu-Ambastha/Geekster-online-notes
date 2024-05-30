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
        printReverse(n, arr);
    }

    public static void printReverse(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}