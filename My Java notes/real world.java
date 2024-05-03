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
        } else if (marks > 80 && marks <=90) {
            performance = "good";
        } else if (marks > 70 && marks <=80) {
            performance = "fair";
        } else if (marks > 60 && marks <=70) {
            performance = "meets expectations";
        } else if (marks > 40 && marks <=60) {
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

//hw_Tax or not
import java.io.*;
import java.util.*;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        long income = scanner.nextLong();

        if (income < 500000) {
            System.out.println("No tax to be paid");
        } else {
            System.out.println("Tax to be paid");
        }
    }
}

//HW_GKSTR06 Greater_Number
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        if (num1 > num2){
         System.out.println(num1);
        }else if (num1 <num2){
         System.out.println(num2);
       }else{
         System.out.println(num1);
     }
    }
}

//HW_GKSTR04 Even_Or_Odd
import java.io.*;
import java.util.*;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

//HW_Print age bracket
import java.io.*;
import java.util.*;

public class AgeCategoryPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int age = scanner.nextInt();

        if (age >= 70) {
            System.out.println("Super Senior Citizen");
        } else if (age >= 59) {
            System.out.println("Senior Citizen");
        } else if (age >= 18) {
            System.out.println("Adult");
        } else if (age > 1) {
            System.out.println("Underage");
        } else {
            System.out.println("New Born");
        }
    }
}

//HW_Print final salary given age
import java.io.*;
import java.util.*;

public class CalculateFinalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int age = scanner.nextInt();

        System.out.print("");
        int salary = scanner.nextInt();

        int finalIncome;
        if (age > 60) {
            finalIncome = salary + 1000;
        } else if (age > 40 && age <= 60) {
            finalIncome = salary + 500;
        } else {
            finalIncome = salary;
        }

        System.out.println("" + finalIncome);
    }
}

//Print the oldest among three
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();

        if(A > B && A > C){
         System.out.println("A");   
       }else if(B > A && B > C){
         System.out.println("B");   
       }else{
         System.out.println("C");   
       }
    }
}

//Rich Adult Young
import java.io.*;
import java.util.*;

public class AgeAndSalaryAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int age = scanner.nextInt();

        System.out.print("");
        int salary = scanner.nextInt();


        if (age > 40) {
            if (salary >= 30000) {
                System.out.println("You are rich and adult");
            } else {
                System.out.println("You are an adult");
            }
        } else {
            if (salary >= 12000) {
                System.out.println("You are rich and young");
            } else {
                System.out.println("You are young");
            }
        }
    }
}
