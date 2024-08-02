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
        System.out.println(miniCostOfRopes(arr, n));
    }

    public static int miniCostOfRopes(int[] arr, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
        }
        int cost = 0;
        while (pq.size() > 1) {
            int rope1 = pq.poll();
            int rope2 = pq.poll();
            cost += rope1 + rope2;
            pq.add(rope1 + rope2);
        }
        return cost;
    }
}