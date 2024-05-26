import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int steps = 0;
        while (n >= 1) {
            n = n / 2;
            steps++;
        }
        System.out.println(steps);
    }
}
