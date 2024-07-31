import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[2 * N];

        for (int i = 0; i < 2 * N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            int sum = arr[i] + arr[2 * N - 1 - i];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}