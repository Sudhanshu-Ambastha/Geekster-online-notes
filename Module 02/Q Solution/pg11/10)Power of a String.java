import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(powerOfString(str));
    }

    static int powerOfString(String str) {
        int len = 1;
        int ans = 0;

        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                len++;
            } else {
                ans = Math.max(ans, len);
                len = 1;
            }
        }
        ans = Math.max(ans, len);
        return ans;
    }
}