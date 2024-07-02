import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] gain = new int[n];

        for (int i = 0; i < n; i++) {
            gain[i] = scn.nextInt();
        }

        int highestAltitude = findHighestAltitude(gain);
        System.out.println(highestAltitude);
    }

    public static int findHighestAltitude(int[] gain) {
        int n = gain.length;
        int[] altitude = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            altitude[i] = altitude[i - 1] + gain[i - 1];
        }

        int highest = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            highest = Math.max(highest, altitude[i]);
        }

        return highest;
    }
}