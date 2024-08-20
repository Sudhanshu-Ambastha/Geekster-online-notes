import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        int maximal = -100;
        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();

            if (num > maximal) {
                count++;
                maximal = num;
            }
        }
        System.out.println(count);
    }
}