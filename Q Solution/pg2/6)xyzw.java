import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        int w = scn.nextInt();

        String ans = ((x * y) == (z * w)) ? "True" : "False";

        System.out.println(ans);
    }
}