import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();

        // Print 12 lines, each with 'n' stars
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}