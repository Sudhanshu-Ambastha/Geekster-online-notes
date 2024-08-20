import java.util.Scanner;

public class Main {
    public static void printEvenNumbers(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            printEvenNumbers(x, y);
        }
    }
}