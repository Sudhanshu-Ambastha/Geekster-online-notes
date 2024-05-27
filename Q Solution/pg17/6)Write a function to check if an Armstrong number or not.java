import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            boolean isArmstrong = checkArmstrong(n);
            System.out.println(isArmstrong);
        }
    }

    public static boolean checkArmstrong(int n) {
        int originalNumber, remainder, result = 0;
        originalNumber = n;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        return result == n;
    }
}