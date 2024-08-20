import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 5;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        scanner.close();
    }
}