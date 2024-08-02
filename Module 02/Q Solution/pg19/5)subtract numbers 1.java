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

        System.out.println(subtractNum(arr, n));
    }

    public static int subtractNum(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (i > 0) {
                set.add(i);
            }
        }

        return set.size();
    }
}