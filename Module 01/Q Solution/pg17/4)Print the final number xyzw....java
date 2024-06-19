import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            ans = ans * 10 + num;
        }
        System.out.println(ans);
    }
}
