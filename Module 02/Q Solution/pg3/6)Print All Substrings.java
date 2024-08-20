import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                print(str, i, j);
            }
        }
    }

    public static void print(String str, int i, int j) {
        for (int k = i; k <= j; k++) {
            System.out.print(str.charAt(k));
        }
        System.out.println();
    }
}