import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        String performance;
        if (marks > 90) {
            performance = "excellent";
        } else if (marks > 80 && marks <= 90) {
            performance = "good";
        } else if (marks > 70 && marks <= 80) {
            performance = "fair";
        } else if (marks > 60 && marks <= 70) {
            performance = "meets expectations";
        } else if (marks > 40 && marks <= 60) {
            performance = "below par";
        } else {
            performance = "failed";
        }

        System.out.println("" + performance);
    }
}