import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        String ans = (x) > 1000 ? "True" : "False";

        System.out.println(ans);
    }
}