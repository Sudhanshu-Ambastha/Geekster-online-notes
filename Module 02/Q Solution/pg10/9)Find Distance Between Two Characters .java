import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);

        System.out.println(minDistance(str, a, b));
    }

    public static int minDistance(String str, char a, char b) {
        int minDistance = Integer.MAX_VALUE;
        int aIndex = -1;
        int bIndex = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                aIndex = i;
                if (bIndex != -1) {
                    minDistance = Math.min(minDistance, Math.abs(aIndex - bIndex) - 1);
                }
            } else if (str.charAt(i) == b) {
                bIndex = i;
                if (aIndex != -1) {
                    minDistance = Math.min(minDistance, Math.abs(aIndex - bIndex) - 1);
                }
            }
        }

        return minDistance;
    }
}