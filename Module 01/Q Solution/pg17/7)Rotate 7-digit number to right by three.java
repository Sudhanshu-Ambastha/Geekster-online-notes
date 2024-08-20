import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int num = scn.nextInt();

            int ans = rotateShift(num);
            System.out.println(ans);
        }
    }

    public static int rotateShift(int n) {
        int a = n % 1000;
        n = n / 1000;

        int ans = (a * 10000) + n;
        return ans;
    }
}