//Calc, Area & Parameter, Fahrenheit and Celcius, add last digit, area of circle, area of triangle
// for writing '+' or '-' 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
        
      int x=scn.nextInt();
      int y=scn.nextInt();
        
      int sum = x + y;
      int diff = x - y;
        
      System.out.println(sum);
      System.out.println(diff);
    }
}

//for complete calc
// for writing '+','-','/','*' 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
        
      int x=scn.nextInt();
      int y=scn.nextInt();
        
      int sum = x + y;
      int diff = x - y;
      int multiply = x * y;
      int divide = x / y; 
        
      System.out.println(sum);
      System.out.println(diff);
      System.out.println(multiply);
      System.out.println(divide);
    }
}

// for calculating area and parameter
import java.io.*;
import java.util.*;

public class Solution {

     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int breadth = scn.nextInt();
       
        int area = length * breadth;
        int parameter = 2 * (length + breadth);

        System.out.println(area);
       System.out.println(parameter);
    }
}

// for calculating parameter and celsius
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

// add last digit
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int digit1 = a % 10;
        int digit2 = b % 10;

        int ans = (digit1 + digit2);
        System.out.println(ans);
    }
}

//Area of circle
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        int r = d/2;
        int r2= r*r;
        int area = (22 * r2 / 7);
        System.out.println(area);
    }
}

//Area of Triangle
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double b = scn.nextDouble();
        double h = scn.nextDouble();
        double area = (b*h/2);
        System.out.println(area);
    }
}
