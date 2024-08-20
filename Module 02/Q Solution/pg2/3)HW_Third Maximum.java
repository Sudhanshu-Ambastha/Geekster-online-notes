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

        int thirdMax = findThirdMax(arr);
        System.out.println(thirdMax);
    }

    public static int findThirdMax(int[] arr) {
        Arrays.sort(arr);
        int distinctCount = 0;
        int lastDistinct = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != lastDistinct) {
                distinctCount++;
                lastDistinct = arr[i];
            }
            if (distinctCount == 3) {
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }
}