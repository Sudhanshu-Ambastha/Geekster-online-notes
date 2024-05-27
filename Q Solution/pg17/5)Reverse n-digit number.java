import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();
            ans = ans * 10 + num;
        }
        System.out.println(ans);
        int result = reverse(ans);
        System.out.println(result);
    }

    public static int reverse(int n) {
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        return reverse;
    }
}