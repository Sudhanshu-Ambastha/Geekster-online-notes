import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        int r = d / 2;
        int r2 = r * r;
        int area = (22 * r2 / 7);
        System.out.println(area);
    }
}