import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char x = scn.next().charAt(0);
        char y = scn.next().charAt(0);

        int digitX = ((x - '0'));
        int digitY = ((y - '0'));

        if (x == 0) {
            System.out.println(digitY);
        } else {
            System.out.println(digitX * 10 + digitY);
        }
    }
}