import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                currentConsecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
            } else {
                currentConsecutiveOnes = 0;
            }
        }

        System.out.println(maxConsecutiveOnes);
    }
}