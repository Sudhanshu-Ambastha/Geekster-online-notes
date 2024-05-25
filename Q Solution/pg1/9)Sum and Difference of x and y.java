import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();

        int sum = x + y;
        int diff = x - y;

        System.out.println(sum);
        System.out.println(diff);
    }
}