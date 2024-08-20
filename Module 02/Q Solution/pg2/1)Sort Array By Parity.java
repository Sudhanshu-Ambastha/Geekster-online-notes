import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
            if (a % 2 == 0 && b % 2 == 0) {
                return a - b;
            } else if (a % 2 != 0 && b % 2 != 0) {
                return a - b;
            } else if (a % 2 == 0 && b % 2 != 0) {
                return -1;
            } else if (a % 2 != 0 && b % 2 == 0) {
                return 1;
            }
            return 0;
        });

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}