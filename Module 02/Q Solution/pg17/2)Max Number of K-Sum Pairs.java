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
        int k = scn.nextInt();
        System.out.println(maxNumPairs(arr, n, k));
    }

    public static int maxNumPairs(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int num1 = arr[i];
            int num2 = k - num1;
            if (map.containsKey(num2)) {
                if (i != map.get(num2)) {
                    count++;
                    map.remove(num1);
                    map.remove(num2);
                }
            }
        }

        return count;
    }
}