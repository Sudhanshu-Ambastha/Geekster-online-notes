import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scn.nextInt();
            int y = scn.nextInt();

            sum(x, y);
        }
    }

    public static void sum(int x, int y) {
        int ans = x + y;
        System.out.println(ans);
    }
}