import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            if (n == 1) {
                System.out.println(que.size());
            } else if (n == 2) {
                if (que.size() == 0) {
                    System.out.println("-1");
                } else {
                    int val = que.poll();
                }
            } else if (n == 3) {
                int x = scn.nextInt();
                que.add(x);
            } else if (n == 4) {
                if (que.size() == 0) {
                    System.out.println("-1");
                } else {
                    int val = que.peek();
                    System.out.println(val);
                }
            }
        }
    }
}