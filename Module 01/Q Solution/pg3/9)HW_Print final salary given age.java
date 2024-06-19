import java.io.*;
import java.util.*;

public class CalculateFinalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int age = scanner.nextInt();

        System.out.print("");
        int salary = scanner.nextInt();

        int finalIncome;
        if (age > 60) {
            finalIncome = salary + 1000;
        } else if (age > 40 && age <= 60) {
            finalIncome = salary + 500;
        } else {
            finalIncome = salary;
        }

        System.out.println("" + finalIncome);
    }
}