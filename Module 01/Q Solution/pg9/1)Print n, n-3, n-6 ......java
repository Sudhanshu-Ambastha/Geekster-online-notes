import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 0) {
            while (n > 0) {
                System.out.println(n);
                n -= 3;
            }
        }
    }
}