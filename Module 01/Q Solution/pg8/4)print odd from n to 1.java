import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n % 2 == 0) {
            n--;
        }

        for (int i = n; i >= 1; i -= 2) {
            System.out.println(i);
        }
    }
}