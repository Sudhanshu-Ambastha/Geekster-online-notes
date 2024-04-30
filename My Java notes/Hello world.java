/* via regular way to perform hello world*/
import java.io.*;
import java.util.*;
/* code alys goes top to bottm & left to right*/
public class Solution {

    public static void main(String[] args) {
        System.out.print("hello world"); /*Where the execution starts*/
    }
}

/* for printing in multiline */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("World.");
        System.out.println("I");
        System.out.println("am");
        System.out.println("coding");
   
    }
}

/* for printing in multiline but typed in single line */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println("hello\nworld\nI\nam\ncoding");
    }
}

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
