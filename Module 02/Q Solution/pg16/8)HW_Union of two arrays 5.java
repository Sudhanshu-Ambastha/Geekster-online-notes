import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int m = s.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }

        HashSet<Integer> union = new HashSet<>();

        for (int i = 0; i < n; i++) {
            union.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            union.add(b[i]);
        }

        System.out.println(union.size());
    }
}