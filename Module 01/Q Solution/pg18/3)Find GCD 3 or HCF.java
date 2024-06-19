import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scn.nextInt();
            int y = scn.nextInt();

            int ans = GCD(x, y);
            System.out.println(ans);
        }
    }

    public static int GCD(int x, int y) {
        int ans = 1;
        for (int i = 1; i <= Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                ans = i;
            }
        }
        return ans;
    }
}