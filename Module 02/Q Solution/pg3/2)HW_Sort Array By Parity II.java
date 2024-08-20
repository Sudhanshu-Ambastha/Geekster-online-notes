import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int[] nums = new int[n];
        int[] even = new int[n / 2];
        int[] odd = new int[n / 2];
        int j = 0, k = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] % 2 == 0) {
                even[j] = nums[i];
                j++;
            } else {
                odd[k] = nums[i];
                k++;
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);
        j = 0;
        k = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = even[j];
                j++;
            } else {
                arr[i] = odd[k];
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
