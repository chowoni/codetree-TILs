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

            for (int j = a; j <= b; j++)
                arr[j]++;
            
        }

        int max = Arrays.stream(arr).max().orElse(0);

        System.out.println(max);
    }
}