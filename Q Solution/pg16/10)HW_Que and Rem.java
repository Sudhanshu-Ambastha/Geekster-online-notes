import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();

        int[] result = findQuotientAndRemainder(a, b);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] findQuotientAndRemainder(int a, int b) {
        int[] result = new int[2];
        result[0] = a / b; // Quotient
        result[1] = a % b; // Remainder
        return result;
    }
}