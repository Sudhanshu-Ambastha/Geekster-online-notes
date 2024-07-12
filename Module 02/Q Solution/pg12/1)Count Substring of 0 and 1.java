import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(countSubString(str));
    }

    public static int countSubString(String str) {
        int n = str.length();
        int i = 0;
        int ans = 0;

        while (i < n) {
            int countZero = 0;
            int countOne = 0;

            if (str.charAt(i) == '0') {
                while (i < n && str.charAt(i) == '0') {
                    countZero++;
                    i++;
                }
                int j = i;
                while (j < n && str.charAt(j) == '1') {
                    countOne++;
                    j++;
                }
            } else {
                while (i < n && str.charAt(i) == '1') {
                    countOne++;
                    i++;
                }
                int j = i;
                while (j < n && str.charAt(j) == '0') {
                    countZero++;
                    j++;
                }
            }
            ans += Math.min(countZero, countOne);
        }

        return ans;
    }
}