import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int salary = scn.nextInt();
        int years = scn.nextInt();

        if (years > 5) {
            double bonus = (salary * 0.05);
            System.out.println((int) bonus);
        } else {
            System.out.println(0);
        }
    }
}
