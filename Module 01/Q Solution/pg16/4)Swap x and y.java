
//1st  way (way told in Q)
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int c = x;

        System.out.println("c = " + c);

        x = y;
        System.out.println("x = " + x);

        y = c;
        System.out.println("y = " + y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

// 2nd way
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        swap(x, y);
    }

    public static void swap(int x, int y) {
        int c = x;
        System.out.println("c = " + c);

        x = y;
        System.out.println("x = " + x);

        y = c;
        System.out.println("y = " + y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
