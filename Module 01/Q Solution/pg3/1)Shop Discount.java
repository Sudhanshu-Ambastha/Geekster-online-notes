import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("");
        int units = scn.nextInt();
        int unitCost = 100;

        int totalCost = units * unitCost;

        if (totalCost > 1000) {
            totalCost = (int) (totalCost * 0.9);
        }

        System.out.println("" + totalCost);
    }
}