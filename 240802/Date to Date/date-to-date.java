import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt(); // 시작 월
        int d1 = sc.nextInt(); // 시작 일
        int m2 = sc.nextInt(); // 종료 월
        int d2 = sc.nextInt(); // 종료 일

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;

        totalDays += daysInMonth[m1 - 1] - d1 + 1;

        if (m1 == m2) {
            totalDays = d2 - d1 + 1;
        } else {
            for (int month = m1; month < m2 - 1; month++) {
                totalDays += daysInMonth[month];
            }

            totalDays += d2;
        }

        System.out.println(totalDays);
    }
}