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
        maxProd(arr, n);
    }

    public static void maxProd(int[] arr, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int a = pq.poll();
        int b = pq.poll();
        System.out.println((a - 1) * (b - 1));
    }
}