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
        System.out.println(reduceArraySizeToHalf(arr, n));
    }

    public static int reduceArraySizeToHalf(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]) == false) {
                map.put(arr[i], 1);
            } else {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq + 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        for (int i : map.values()) {
            pq.add(i);
        }
        int size = n;
        int count = 0;
        while (size > n / 2) {
            count++;
            int rem = pq.peek();
            size = size - rem;
            pq.poll();
        }
        return count;
    }
}