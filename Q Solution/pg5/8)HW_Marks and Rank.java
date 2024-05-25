import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");

        double marks = scanner.nextDouble();
        double rank = scanner.nextDouble();

        if (marks < 20 || rank > 100) {
            System.out.println("Needs improvement");
        } else if (marks < 40 || rank > 80) {
            System.out.println("Concentrate");
        } else if (marks < 60 || rank > 120) {
            System.out.println("Needs to focus");
        } else if (marks > 100 || rank < 10) {
            System.out.println("Very good");
        } else {
            System.out.println("Bright Student");
        }
    }
}