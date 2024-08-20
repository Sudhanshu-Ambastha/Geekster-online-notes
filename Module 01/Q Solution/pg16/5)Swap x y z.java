import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integer inputs
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        // Swap the values
        int temp = x;
        x = z;
        z = y;
        y = temp;

        // Print the swapped values
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        scanner.close();
    }
}
