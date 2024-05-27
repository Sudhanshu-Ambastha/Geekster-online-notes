import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int num = scanner.nextInt();
            int lastThreeDigits = num % 1000;
            int firstFourDigits = num / 1000;
            int rotatedNum = (lastThreeDigits * 10000) + firstFourDigits;
            System.out.println(rotatedNum);
        }

        scanner.close();
    }
}