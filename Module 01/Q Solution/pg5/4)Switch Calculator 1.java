import java.io.*;
import java.util.*;

public class OperationsBasedOnN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (b > a || (N == 50 && b == 0)) {
            System.out.println("Enter a valid number.");
        } else {
            switch (N) {
                case 10:
                    System.out.println(a + b);
                    break;
                case 20:
                    System.out.println(a - b);
                    break;
                case 30:
                    System.out.println(a * b);
                    break;
                case 40:
                    System.out.println(a % b);
                    break;
                case 50:
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
        }
    }
}