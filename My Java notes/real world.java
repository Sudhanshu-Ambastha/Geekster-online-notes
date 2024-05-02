//Shop Discount
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

//High sum or low sum
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
           
        int sum = (x + y);

        String ans =(sum >= 100) ? "High Sum" : "Low Sum";

        System.out.println(ans);
    }
}

//
