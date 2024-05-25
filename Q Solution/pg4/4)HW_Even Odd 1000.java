import java.io.*;
import java.util.*;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            if (num > 1000) {
                System.out.println("Even and above 1000");
            } else {
                System.out.println("Even");
            }
        } else {
            if (num > 1000) {
                System.out.println("Odd and above 1000");
            } else {
                System.out.println("Odd");
            }
        }
    }
}