import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        findComb(n, r);
    }

    public static void findComb(int n, int r) {
        int a = fact(n);
        int b = fact(n - r);
        int c = fact(r);

        int ans = a / (b * c);
        System.out.println(ans);
    }

    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}