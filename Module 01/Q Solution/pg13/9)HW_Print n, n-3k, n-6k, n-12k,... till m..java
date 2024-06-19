import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();

        while (n >= m) {
            System.out.print(n + " ");
            n -= 3 * k;
        }

        sc.close();
    }
}