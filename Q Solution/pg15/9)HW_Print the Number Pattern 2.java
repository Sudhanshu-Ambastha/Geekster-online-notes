import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   "); // print three spaces for each iteration
            }
            for (int j = 1; j <= i; j++) {
                int num = j * k;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}