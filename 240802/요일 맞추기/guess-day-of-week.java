import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekDays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        // 기준 요일은 2011년 1월 1일이 토요일이므로 0: Sun, 1: Mon, ..., 6: Sat
        int baseDayOfWeek = 6; // 2011년 1월 1일은 토요일

        // 날짜 차이 계산
        int daysBetween = calculateDaysBetween(m1, d1, m2, d2, daysInMonth);

        // 요일 계산
        int targetDayOfWeek = (baseDayOfWeek + daysBetween) % 7;

        // 결과 출력
        System.out.println(weekDays[targetDayOfWeek]);
    }

    public static int calculateDaysBetween(int m1, int d1, int m2, int d2, int[] daysInMonth) {
        // 시작 날짜가 종료 날짜보다 뒤인 경우 일수를 계산하기 위해 순서를 변경
        if (m1 > m2 || (m1 == m2 && d1 > d2)) {
            int tempM = m1, tempD = d1;
            m1 = m2;
            d1 = d2;
            m2 = tempM;
            d2 = tempD;
        }

        // 두 날짜까지의 총 일수 계산
        int daysFromStart1 = calculateDaysFromStart(m1, d1, daysInMonth);
        int daysFromStart2 = calculateDaysFromStart(m2, d2, daysInMonth);

        return daysFromStart2 - daysFromStart1;
    }

    public static int calculateDaysFromStart(int month, int day, int[] daysInMonth) {
        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days += daysInMonth[i];
        }
        days += day;
        return days;
    }
}