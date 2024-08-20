import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        String ans = (a % 2) == 0 ? "True" : "False";

        System.out.println(ans);
    }
}