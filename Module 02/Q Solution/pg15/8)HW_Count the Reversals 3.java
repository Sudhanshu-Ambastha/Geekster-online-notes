import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int result = minReversals(S);
        System.out.println(result);
    }

    public static int minReversals(String S) {
        if (S.length() % 2 != 0) {
            return -1;
        }

        int openCount = 0;
        int closeCount = 0;

        for (char c : S.toCharArray()) {
            if (c == '{') {
                openCount++;
            } else {
                if (openCount > 0) {
                    openCount--;
                } else {
                    closeCount++;
                }
            }
        }

        return (openCount + 1) / 2 + (closeCount + 1) / 2;
    }
}