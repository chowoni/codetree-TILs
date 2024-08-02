import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a >= 0 && a < n && b >= 0 && b < n && a <= b) {
                for (int j = a; j <= b; j++)
                    arr[j]++;
            } else {
                System.out.println("Invalid range: " + a + " to " + b);
                return;
            }
        }

        int max = Arrays.stream(arr).max().orElse(0);

        System.out.println(max);
    }
}