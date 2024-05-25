import java.io.*;
import java.util.*;

public class ProductEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        long product = (long) num1 * num2 * num3 * num4;

        boolean isGreaterThan1000 = product > 1000;

        System.out.println(isGreaterThan1000);
    }
}