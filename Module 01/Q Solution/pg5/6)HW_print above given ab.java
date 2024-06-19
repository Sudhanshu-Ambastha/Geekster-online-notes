import java.io.*;
import java.util.*;

public class ConditionalOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 100 && b > 10) {
            System.out.println("a is above 100 and b is above 10");
        } else if (a > 50 && b > 50) {
            System.out.println("a is above 50 and b is above 50");
        } else if (a > 20 && b > 100) {
            System.out.println("a is above 20 and b is above 100");
        } else {
            System.out.println("None");
        }
    }
}