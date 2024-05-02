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

//Grade the student 1
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
      
        String performance;
        if (marks > 90) {
            performance = "excellent";
        } else if (marks > 80) {
            performance = "good";
        } else if (marks > 70) {
            performance = "fair";
        } else if (marks > 60) {
            performance = "meets expectations";
        } else if (marks > 40) {
            performance = "below par";
        } else {
            performance = "failed";
        }

        System.out.println("" + performance);
    }
}

//Print Bonus
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int salary = scn.nextInt();
        int years = scn.nextInt();

        if (years > 5) {
            double bonus = (salary * 0.05); 
            System.out.println((int) bonus);
        } else {
            System.out.println(0);
        }
    }
}
