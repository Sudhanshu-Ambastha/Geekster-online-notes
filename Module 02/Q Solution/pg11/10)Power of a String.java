import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int power = calculatePower(str);
        System.out.println(power);
    }

    static int calculatePower(String str) {
        int maxPower = 1;
        int currentPower = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentPower++;
                if (currentPower > maxPower) {
                    maxPower = currentPower;
                }
            } else {
                currentPower = 1;
            }
        }

        return maxPower;
    }
}