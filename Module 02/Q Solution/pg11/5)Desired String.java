import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int n = str.length();
        desiredSubstrings(str, n);
    }

    public static void desiredSubstrings(String str, int n) {
        int count = 0;
        int maxLen = 0;
        String maxLenSubstring = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);

                if (sub.length() > 1 && sub.charAt(0) == 'A' && sub.charAt(sub.length() - 1) == 'A') {
                    count++;
                    if (sub.length() > maxLen) {
                        maxLen = sub.length();
                        maxLenSubstring = sub;
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
            System.out.println(maxLen);
            System.out.println(maxLenSubstring);
        }
    }
}