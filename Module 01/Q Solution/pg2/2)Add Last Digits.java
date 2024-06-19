import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int digit1 = a % 10;
        int digit2 = b % 10;

        int ans = (digit1 + digit2);
        System.out.println(ans);
    }
}