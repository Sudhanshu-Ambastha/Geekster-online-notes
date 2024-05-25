import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basicSalary = scanner.nextInt();
        char grade = scanner.next().charAt(0);

        int totalSalary = calculateTotalSalary(basicSalary, grade);
        System.out.println(totalSalary);
    }

    public static int calculateTotalSalary(int basicSalary, char grade) {
        double hra = 0.20 * basicSalary;
        double da = 0.50 * basicSalary;
        double allow;

        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double pf = 0.11 * basicSalary;

        double totalSalary = basicSalary + hra + da + allow - pf;

        int roundedSalary = (int) Math.round(totalSalary);
        return roundedSalary;
    }
}