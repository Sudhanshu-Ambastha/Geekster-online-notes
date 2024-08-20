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
        int D = scn.nextInt();
        System.out.println(weightyVoyage(arr, D));
    }

    public static int weightyVoyage(int[] weights, int D) {
        int i = 0;
        int j = 0;
        for (int weight : weights) {
            i = Math.max(i, weight);
            j += weight;
        }

        while (i < j) {
            int mid = (j + i) / 2;
            int days = 1;
            int currentWeight = 0;
            for (int weight : weights) {
                if (currentWeight + weight > mid) {
                    days++;
                    currentWeight = 0;
                }
                currentWeight += weight;
            }

            if (days > D) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }

        return i;
    }
}