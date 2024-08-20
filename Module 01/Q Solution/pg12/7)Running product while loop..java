import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 1;

        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();
            ans = ans * num;
            System.out.print(ans + " ");
        }
    }
}