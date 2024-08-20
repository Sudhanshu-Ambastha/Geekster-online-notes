import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();
            boolean ans = isArmstrong(num);
            System.out.println(ans);
        }
    }

    public static boolean isArmstrong(int num) {
        int ans = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            ans = ans + (rem * rem * rem);
            num = num / 10;
        }
        if (ans == temp) {
            return true;
        } else {
            return false;
        }
    }
}