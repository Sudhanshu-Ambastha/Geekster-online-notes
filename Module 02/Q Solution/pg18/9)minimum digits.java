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
        System.out.println(minimumDigits(arr, n));
    }

    public static long minimumDigits(int[] arr, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
        }
        long num1 = 0;
        long num2 = 0;
        while (pq.size() > 0) {
            int rem = pq.poll();
            if (pq.size() % 2 == 0) {
                num1 = num1 * 10 + rem;
            } else {
                num2 = num2 * 10 + rem;
            }
        }
        return num1 + num2;
    }
}