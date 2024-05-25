import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int l = scanner.nextInt();
            int b = scanner.nextInt();

            printLB(l, b);
        }
    }

    public static void printLB(int l, int b) {
        int area = l * b;
        System.out.println(area);
    }
}