import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        if (x >= 0 && x < y && y <= 10000) {
            int i = x;
            while (i <= y) {
                System.out.println(i);
                i++;
            }
        } else {
            System.out.println("Invalid input. Please make sure 0 <= x < y <= 10000.");
        }

        input.close();
    }
}