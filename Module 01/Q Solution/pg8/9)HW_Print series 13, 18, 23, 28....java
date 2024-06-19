import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 13; i <= n; i += 5) {
            System.out.print(i + " ");
        }
    }
}