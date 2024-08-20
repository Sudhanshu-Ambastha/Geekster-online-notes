import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        // input for experience
        double XP = scanner.nextDouble();
        // input for Salary
        double PAY = scanner.nextDouble();
        // input for Rank
        double RK = scanner.nextDouble();

        if (XP >= 10 || PAY >= 50000 || RK >= 10) {
            System.out.println("You are in top management");
        } else {
            System.out.println("You are not in top management");
        }
    }
}