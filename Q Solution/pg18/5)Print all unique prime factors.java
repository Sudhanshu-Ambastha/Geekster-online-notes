import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                System.out.println(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        
        if (n > 2) {
            System.out.println(n);
        }
    }
}