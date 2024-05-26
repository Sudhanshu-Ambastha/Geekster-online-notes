import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a = 0;
        int b = 1;
        int c;
        int i = 0;
        while (i < n) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.print(a);
    }
}