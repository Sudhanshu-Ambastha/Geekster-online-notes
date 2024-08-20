import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int y = scanner.nextInt();

        if (X >= 59 && y >= 10) {
            System.out.println("X is greater than or equal to 59 and y is greater than or equal to 10");
        } else if (X >= 50 && y < 10) {
            System.out.println("X is greater than or equal to 50 and y is less than 10");
        } else {
            System.out.println("None of the condition matches");
        }
    }
}