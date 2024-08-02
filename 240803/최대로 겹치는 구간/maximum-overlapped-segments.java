import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int offset = 100;
        int[] arr = new int[201];

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start + offset; j < end + offset; j++) {
                arr[j]++;
            }
        }

        System.out.print(Arrays.stream(arr).max().getAsInt());
    }
}