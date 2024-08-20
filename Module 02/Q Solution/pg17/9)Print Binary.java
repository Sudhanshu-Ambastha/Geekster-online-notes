import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printBinary(n);
    }

    public static void printBinary(int n) {
        Queue<String> que = new LinkedList<>();
        que.add("1");
        for (int i = 0; i < n; i++) {
            String rem = que.poll();
            System.out.print(rem + " ");

            String str1 = rem + "0";
            que.add(str1);

            String str2 = rem + "1";
            que.add(str2);
        }
    }
}