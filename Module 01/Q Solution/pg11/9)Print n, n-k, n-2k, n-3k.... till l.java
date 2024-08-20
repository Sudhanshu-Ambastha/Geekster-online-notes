import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int l = scn.nextInt();

        int i = n;
        while (i >= l) {
            System.out.println(i);
            i -= k;
        }
    }
}