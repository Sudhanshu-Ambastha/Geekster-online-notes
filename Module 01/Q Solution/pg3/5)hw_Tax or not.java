import java.io.*;
import java.util.*;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        long income = scanner.nextLong();

        if (income < 500000) {
            System.out.println("No tax to be paid");
        } else {
            System.out.println("Tax to be paid");
        }
    }
}