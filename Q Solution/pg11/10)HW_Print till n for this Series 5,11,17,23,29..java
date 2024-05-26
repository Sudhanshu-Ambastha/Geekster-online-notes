import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("");
        int n = input.nextInt();

        int start = 5;
        while (start <= n) {
            System.out.println(start);
            start += 6;
        }
    }
}