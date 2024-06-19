import java.io.*;
import java.util.*;

public class Solution {

    // from 4 to 9 by +9
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = 4;
        while (i <= n) {
            System.out.println(i);
            i += 9;
        }
    }
}