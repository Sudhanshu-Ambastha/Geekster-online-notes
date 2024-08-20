import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(squareRoot(n));
    }

    public static int squareRoot(int n) {
        int i = 1;
        int j = n;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                j = mid - 1;
            } else if (mid * mid < n) {
                i = mid + 1;
            }
        }
        return j;
    }
}