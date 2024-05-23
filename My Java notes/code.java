//Fibonacci number 12
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int a = 0;
        int b =1;
        int sum = 0;
        for (int i = 1; i<=n; i++){
           System.out.print(a + " ");
            sum = a+b;
            a = b;
            b =sum;
        }
    }
}

//teps till n greater than 0
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
       for (int i=0; i<t; i++){
        int n = scn.nextInt();
        int steps = 0;
        while(n>0){
            if(n%2==0){
                n--;
            }else{
                n-=3;
            }
            steps++;
        }
        System.out.println(steps);
       }
    }
}

//nth power of 10 using while loop
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();

        int i = 0;
        int ans = 1;
        while(i<n){
            ans = ans * 10;
            i++;
        }
        System.out.println(ans);
    }
}

//Running product while loop.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 1;

        for(int i =0; i<n; i++){
            int num = scn.nextInt();
            ans = ans*num;
            System.out.print(ans + " ");
        }
    }
}

//Print nth Tribonacci number
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        if(n==0){
            System.out.println(0);
        }else if(n==1){
            System.out.println(1);
        }else if(n==2){
            System.out.println(1);
        }else{
            
            int a = 0;
            int b = 1;
            int c = 1;
            int sum = 0;
            for (int i = 3; i <= n; i++){
                sum=a+b+c;
                a = b;
                b = c;
                c = sum;
            }
            System.out.println(sum);
        }
    }
}

//Print all digits from end
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n > 0){
            int rem = n % 10;
            n = n/10;
            System.out.println(rem);
        }
    }
}

//GKSTR46 Number of Digits
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int digit = 0;
        while( n > 0){
            n = n/10;
            digit++;
        }
        System.out.println(digit);
    }
}

//Print total steps when n/2
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int steps = 0;
        while(n>=1){
            n = n/2;
            steps++;
        }
        System.out.println(steps);
    }
}

//Print steps and update maximum
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        int maximal = -100;
        for(int i = 0; i< n; i++){
            int num = scn.nextInt();
            
            if(num> maximal){
                count++;
                maximal = num;
            }
        }
        System.out.println(count);
    }
}

//GKSTR17 Pattern_2
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        int st = 1;
        for(int i = 0; i < row; i++){
            for(int j =0; j < st; j++){
                System.out.print((j+ 1) + " ");
            }
            st++;
            System.out.println();
        }
    }
}

//Pattern 6 - Right triangle of 5 multiples
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        int st = 1;
        for(int i = 0; i < row; i++){
            for(int j =0; j < st; j++){
                System.out.print((j+ 1) * 5 + "\t");
            }
            st++;
            System.out.println();
        }
    }
}

//Pattern 7 - Print a hollow m by n star rectangle.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int col = scn.nextInt();
        int row = scn.nextInt();
        
        for (int i = 0; i < row; i++){
            for(int j = 0; j< col; j++){
                if(i==0 || j==0 || i==row-1 || j == col-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//Pattern 8 - Print a hollow square without top
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                if(j==0 || i==n-1 || j == n-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//GKSTR24 Pattern_7_Pyramid
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st=1;
        int sp=n-1;
        for(int i=0; i<n; i++){
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int j=0;j<st;j++){
                System.out.print("* ");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}

//GKSTR29_Pattern_12_Diamond
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int sp = n - 1;
        int st = 1;
        int rows = 2 * n - 1;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*");
            }
            
            if (i < rows/2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }
    }
}

//Pattern 9 - Square Ladder with top and bottom
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i % 2 == 0){
                    System.out.print("*\t");
                }else{
                    if(j==0 || j ==n-1){
                       System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}  

//
