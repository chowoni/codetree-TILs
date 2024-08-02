import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] line = new int[101]; // 1부터 100까지의 범위

        // 선분의 정보 입력
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j <= end; j++) {
                line[j]++;
            }
        }

        int maxOverlap = 0;
        for (int i = 1; i <= 100; i++) {
            if (line[i] > maxOverlap) {
                maxOverlap = line[i];
            }
        }

        System.out.println(maxOverlap);
    }
}