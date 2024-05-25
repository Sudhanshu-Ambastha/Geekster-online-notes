import java.io.*;
import java.util.*;

public class HealthStatusChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int weight = scanner.nextInt();
        int age = scanner.nextInt();
        String status;

        if (height == 5 && weight == 50 && age == 10) {
            status = "Overweight";
        } else if (height == 5 || weight == 60) {
            status = "Fat";
        } else if (height == 6 && weight == 50) {
            status = "Slim";
        } else {
            status = "None";
        }

        System.out.println(status);
    }
}