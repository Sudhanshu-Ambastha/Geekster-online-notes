import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        int sum = (x + y);

        String ans = (sum >= 100) ? "High Sum" : "Low Sum";

        System.out.println(ans);
    }
}