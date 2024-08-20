import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(1);
        } else {

            int a = 0;
            int b = 1;
            int c = 1;
            int sum = 0;
            for (int i = 3; i <= n; i++) {
                sum = a + b + c;
                a = b;
                b = c;
                c = sum;
            }
            System.out.println(sum);
        }
    }
}