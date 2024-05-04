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

//Print final z
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int x = scanner.nextInt();

        System.out.print("");
        int y = scanner.nextInt();

        System.out.print("");
        int z = scanner.nextInt();

        int finalZ = calculateZ(x, y, z);
        System.out.println("" + finalZ);
    }

    public static int calculateZ(int x, int y, int z) {
        if (x >= 20) {
            if (y >= 100) {
                z += 100;
            } else if (y >= 50) {
                z += 50;
            } else {
                z += 10;
            }
        } else {
            if (y >= 100) {
                z += 3;
            } else if (y >= 50) {
                z += 2;
            } else {
                z += 1;
            }
        }
        return z;
    }
}

//runner up
import java.io.*;
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int secondLargest = findSecondLargest(A, B, C);

        System.out.println(secondLargest);
        
        scanner.close();
    }
    
    public static int findSecondLargest(int A, int B, int C) {
        
        int max = Math.max(A, Math.max(B, C));
        
        int min = Math.min(A, Math.min(B, C));
        
        int middle = A + B + C - max - min;
        
        return middle;
    }
}

//HW_Marks of a student in 5 subjects
import java.io.*;
import java.util.*;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double subject1 = scanner.nextDouble();
        double subject2 = scanner.nextDouble();
        double subject3 = scanner.nextDouble();
        double subject4 = scanner.nextDouble();
        double subject5 = scanner.nextDouble();

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        double maxMarks = 500.0;
        double percentage = (totalMarks / maxMarks) * 100.0;

        System.out.printf("%.1f%n", totalMarks);
        System.out.printf("%.1f%n", percentage);
    }
}

//HW_abcd 88
import java.io.*;
import java.util.*;

public class ProductEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        long product = (long) num1 * num2 * num3 * num4;

        boolean isGreaterThan1000 = product > 1000;

        System.out.println(isGreaterThan1000);
    }
}

//HW_Grace Marks 1
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int marks = scanner.nextInt();

       if(marks <33){
          int gracemarks = (marks + 4);
          System.out.println(gracemarks);
       }else{
          System.out.println("no grace marks");
       }         
    }
}

//Print the final incremented salary
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

         int age = scn.nextInt();
         int salary = scn.nextInt();
         int experience = scn.nextInt();

        if(age > 60 && salary >20000 && experience > 20){
          salary += 5000;
        }else if(age > 40 && salary >15000 && experience > 10){
          salary += 2000;
        }else if(age > 30 && salary >10000 && experience > 5){
          salary += 1000;
        }else{
          salary += 500;
        }
          System.out.println(salary);
    }
}

//Tell about x y
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int y = scanner.nextInt();

        if(X >= 59 && y >= 10){
         System.out.println("X is greater than or equal to 59 and y is greater than or equal to 10");
        }else if(X >= 50 && y<10){
          System.out.println("X is greater than or equal to 50 and y is less than 10");
        }else {
          System.out.println("None of the condition matches");
        }
    }
}

//Print final z given xyz
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

         int x = scn.nextInt();
         int y = scn.nextInt();
         int z = scn.nextInt();

         if(x>=20 && z<100){
           z= (z + 200);
         }else if(x>=10 || y<50){
           z= (z + 100);
         }
          System.out.println(z);
    }
}

//Print if divisible by both 3 and 4
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if(x % 3 == 0 && x % 4 == 0){
          System.out.println("Divisible by 3 and 4");
        } else {
          System.out.println("Not Divisible");
        }
    }
}
