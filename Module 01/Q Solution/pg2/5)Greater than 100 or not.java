import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        boolean isGreaterThan100 = number > 100;

        System.out.println(isGreaterThan100 ? "True" : "False");
    }
}