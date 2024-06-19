import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        String ans = (x) >= 18 ? "Adult" : "Below age";

        System.out.println(ans);
    }
}