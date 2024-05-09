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
