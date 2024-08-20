import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double f = scn.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println(c);
    }
}