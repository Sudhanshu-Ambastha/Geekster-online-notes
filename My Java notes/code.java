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
