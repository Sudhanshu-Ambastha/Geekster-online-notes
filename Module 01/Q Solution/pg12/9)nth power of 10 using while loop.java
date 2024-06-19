import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = 0;
        int ans = 1;
        while (i < n) {
            ans = ans * 10;
            i++;
        }
        System.out.println(ans);
    }
}