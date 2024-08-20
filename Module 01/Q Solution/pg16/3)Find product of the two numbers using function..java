import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scn.nextInt();
            int y = scn.nextInt();

            findProduct(x, y);
        }
    }

    public static void findProduct(int x, int y) {
        System.out.println(x * y);
    }
}