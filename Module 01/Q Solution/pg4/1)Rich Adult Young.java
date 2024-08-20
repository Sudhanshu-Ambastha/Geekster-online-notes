import java.io.*;
import java.util.*;

public class AgeAndSalaryAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int age = scanner.nextInt();

        System.out.print("");
        int salary = scanner.nextInt();

        if (age > 40) {
            if (salary >= 30000) {
                System.out.println("You are rich and adult");
            } else {
                System.out.println("You are an adult");
            }
        } else {
            if (salary >= 12000) {
                System.out.println("You are rich and young");
            } else {
                System.out.println("You are young");
            }
        }
    }
}