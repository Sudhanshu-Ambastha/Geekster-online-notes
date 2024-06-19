import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();

        int st = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < st; j++) {
                System.out.print((j + 1) + " ");
            }
            st++;
            System.out.println();
        }
    }
}