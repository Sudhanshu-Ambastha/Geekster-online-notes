import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        char ch = scn.next().charAt(0);

        switch (ch) {
            case 'A':
                int sum = x + y;
                System.out.println(sum);
                break;
            case 'S':
                int difference = x - y;
                System.out.println(difference);
                break;
            case 'M':
                int product = x * y;
                System.out.println(product);
                break;
            case 'D':
                int division = x / y;
                System.out.println(division);
                break;
            case 'R':
                int remainder = x % y;
                System.out.println(remainder);
                break;
            default:
                System.out.println("Enter again");
        }
    }
}