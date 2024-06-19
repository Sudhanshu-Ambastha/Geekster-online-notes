import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int ans = reverse(n);
            System.out.println(ans);
        }
    }

    public static int reverse(int n) {
        int a = n % 10;
        int b = n / 10;
        int c = b % 10;
        int d = b / 10;

        int rev = (a * 100) + (c * 10) + d;
        return rev;
    }
}