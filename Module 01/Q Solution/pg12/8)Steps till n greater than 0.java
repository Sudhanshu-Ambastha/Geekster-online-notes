import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int steps = 0;
            while (n > 0) {
                if (n % 2 == 0) {
                    n--;
                } else {
                    n -= 3;
                }
                steps++;
            }
            System.out.println(steps);
        }
    }
}