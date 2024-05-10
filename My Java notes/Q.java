// Male or Female
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char ch = scn.next().charAt(0);

        if (ch == 'M' || ch == 'm'){
         System.out.println("You are a male");
        }else if(ch == 'F' || ch == 'f'){
         System.out.println("You are a female");
        }else{
         System.out.println("Type again");
        }
    }
}

//jumping character
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);   

      if(ch >= 'a' && ch <= 'z'){
        if(ch >= 'a' && ch <= 'w'){
           ch =(char) (ch + 3);
            System.out.println(ch);
        }else{
            System.out.println("Can't jump");
        }
      }else if(ch >= 'A' && ch <= 'Z'){
           if (ch >= 'D' && ch <= 'Z'){
           ch =(char) (ch - 3);
             System.out.println(ch);
        }else {
            System.out.println("Can't jump");
        }
      }
   }
}

//Small Capital or Digit
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);   

        if( ch >= 'a' && ch <= 'z' ){
         System.out.println("Small case");
        }else if( ch >= 'A' && ch <= 'Z' ){
         System.out.println("Capital case");
        }else if( ch >= '0' && ch <= '9' ){
         System.out.println("Digit");
        }else{
         System.out.println("None");
        }
    }
}

//Add if a digit
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);   

        if( ch >= '0' && ch <= '9' ){
           int num = ( ch - '0' );
         System.out.println(num + 100);
        }else{
          System.out.println("This is not a digit");
        }
    }
}

// Toggle the character
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);   

        if( ch >= 'a' && ch <= 'z' ){
         System.out.println((char)(ch-32));
        }
         else if( ch >= 'A' && ch <= 'Z' ){
          System.out.println((char)(ch+32));
        } 
    }
}

// Print character at 3rd index
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     String str = s.nextLine();   

     if(str.length() >= 4){
      char ch = str.charAt(3);
      System.out.println(ch);
     }
      else{
        System.out.println("Small string");
      }
  }
}

//HW_Basic Calculator 9
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt(); 
        int y = scn.nextInt(); 
        char ch = scn.next().charAt(0);

        switch (ch) {
            case 'A':
                int sum = x + y;
                System.out.println(sum);
                break;
            case 'S':
                int difference = x - y;
                System.out.println(difference);
                break;
            case 'M':
                int product = x * y;
                System.out.println(product);
                break;
            case 'D':
                int division = x / y;
                System.out.println(division);
                break;
            case 'R':
                int remainder = x % y;
                System.out.println(remainder);
                break;
            default:
                System.out.println("Enter again");
        }
    }
}

//Concatenate_Two_Strings
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 =scn.nextLine();
        String str2 =scn.nextLine();

        String ans = str1 + str2;
        System.out.println(ans);
    }
}

//string concatenate 2
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();

        if( len1 > len2 ){
         String ans = str2 + str1 + str2;
         System.out.println(ans);
        }else{
         String ans = str1+ str2+ str1;
         System.out.println(ans);
        }
    }
}

//HW_Concatenate 3 strings
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        String str3 = scn.nextLine();

        String str = str1 + str2 + str3;
        int length = str.length();
        char charAtIndex2 = str.charAt(2);
  
        System.out.println(length);
        System.out.println(charAtIndex2);
    }
}

//Hw_Print two-digit number
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         char x = scn.next().charAt(0);
         char y = scn.next().charAt(0);

          int digitX = ((x - '0'));
          int digitY = ((y - '0'));
         
          
         if( x == 0){
          System.out.println(digitY);
         }else{
         System.out.println(digitX * 10 + digitY);
         }
    }
}

// HW_Toggle and 2 jumps left
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         char x =  scn.next().charAt(0);

         char toggledChar;
        if (Character.isUpperCase(x)) {
            toggledChar = Character.toLowerCase(x);
        } else {
            toggledChar = Character.toUpperCase(x);
        }

        if (toggledChar == 'a' || toggledChar == 'A' || toggledChar == 'b' || toggledChar == 'B') {
            System.out.println("Sorry");
        } else if (toggledChar == 'c') {
            System.out.println("a");
        } else if (toggledChar == 'Z') {
            System.out.println("X");
        } else if (!Character.isLetter(x)) {
            System.out.println("No alphabet");
        }else {
            char resultChar = (char) (toggledChar - 2);
            System.out.println(resultChar);
        }
    }
}

//HW_UpperCase_Or_LowerCase
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         char ch =  scn.next().charAt(0);

         if( ch >= 'a' && ch <= 'z' ){
         System.out.println("Char is Lowercase");
        }
         else if( ch >= 'A' && ch <= 'Z' ){
          System.out.println("Char is Uppercase");
        } 
    }
}

//GKSTR09 Print_Range
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 

        for(int i = 1; i<= n; i++){
         System.out.println(i);
        }
    }
}

//Print x to n
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt(); 
        int n = scn.nextInt(); 

        for(int i = x; i<=n; i++){
         System.out.println(i);
        }
    }
}

//Print table of 4
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
        System.out.println("4x" + i + "=" + (4 * i)); 
        }
    }
}

// GKSTR11 Multiple Of 7
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 0; i<=n; i += 7){
        System.out.print(i + " "); 
        }
    }
}

// Print 2,9,16...
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 2; i<=n; i += 7){
        System.out.println(i); 
        }
    }
}

//Print 3 7 11 15...
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 3; i<n; i += 4){
        System.out.println(i); 
        }
    }
}

// Print n to 1
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = n; i>=1; i--){
        System.out.println(i); 
        }
    }
}

// Print n to 0
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = n; i>=0; i--){
        System.out.println(i); 
        }
    }
}

// Print n to x
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();

        for(int i = n; i>=x; i--){
        System.out.println(i); 
        }
    }
}

//Reverse 5 table
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        for(int i = 10; i >= 1; i--){
        System.out.println("5x" + i + "=" + (5 * i)); 
        }
    }
}

// print odd from n to 1
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n % 2 == 0){
         n--;
        }

        for(int i = n; i>=1; i -= 2){
        System.out.println(i); 
        }
    }
}

//HW_Print numbers 20 to n
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

         for(int i = 20; i <= N; i++){
          System.out.print(i + " "); 
        }
    }
}

//HW_Print first N multiples of 9
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1; i<=n; i ++){
        System.out.print(9 * i + " "); 
        }
    }
}

//HW_Print first n multiples of 11.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1; i<=n; i ++){
        System.out.print(11 * i + " "); 
        }
    }
}

//HW_Print Series 3, 11, 19...


//HW_Print n to 5
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = n; i>=5; i--){
        System.out.print(i + " "); 
        }
    }
}

//HW_Print Series 3, 11, 19...
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 3; i <= n; i += 8){
        System.out.print(i + " "); 
        }
    }
}

//HW_Print series 13, 18, 23, 28...
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 13; i <= n; i += 5){
        System.out.print(i + " "); 
        }
    }
}
