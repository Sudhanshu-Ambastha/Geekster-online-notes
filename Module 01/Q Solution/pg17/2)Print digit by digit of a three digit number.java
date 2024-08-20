import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = n % 10;
        int b = n / 10;
        int c = b % 10;
        int d = b / 10;

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}