import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);

        System.out.println(miniDiff(str, ch1, ch2));
    }

    public static int miniDiff(String str, char ch1, char ch2) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ch1)
                for (int j = i + 1; j < str.length(); j++)
                    if (str.charAt(j) == ch2)
                        ans = Math.min(ans, j - i - 1);

        return ans;
    }
}