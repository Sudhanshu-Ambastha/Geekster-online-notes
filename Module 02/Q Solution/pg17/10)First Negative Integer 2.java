import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        firstNegativeInteger(arr, n, k);
    }

    public static void firstNegativeInteger(int[] arr, int n, int k) {
        Queue<Integer> que = new LinkedList<>();
        int i = 0;
        while (i < k) {
            if (arr[i] < 0) {
                que.add(i);
            }
            i++;
        }
        while (i < n) {
            // 1st negative element of current window
            if (que.size() > 0) {
                System.out.print(arr[que.peek()] + " ");
            } else {
                System.out.print(0 + " ");
            }

            // remove all elements which are out of window
            while (que.size() > 0 && que.peek() < (i - k + 1)) {
                que.poll();
            }
            if (arr[i] < 0) {
                que.add(i);
            }
            i++;
        }

        if (que.size() > 0) {
            System.out.print(arr[que.peek()] + " ");
        } else {
            System.out.print(0 + " ");
        }

    }
}