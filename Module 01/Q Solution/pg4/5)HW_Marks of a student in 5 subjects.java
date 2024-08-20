import java.io.*;
import java.util.*;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double subject1 = scanner.nextDouble();
        double subject2 = scanner.nextDouble();
        double subject3 = scanner.nextDouble();
        double subject4 = scanner.nextDouble();
        double subject5 = scanner.nextDouble();

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        double maxMarks = 500.0;
        double percentage = (totalMarks / maxMarks) * 100.0;

        System.out.printf("%.1f%n", totalMarks);
        System.out.printf("%.1f%n", percentage);
    }
}
