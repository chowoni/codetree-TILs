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

        int baseDayOfWeek = 1; // 2011년 1월 1일이 토요일이므로 baseDayOfWeek = 6

        int daysBetween = calculateDaysBetween(m1, d1, m2, d2, daysInMonth);
        int targetDayOfWeek = (baseDayOfWeek + daysBetween) % 7;

        System.out.println(weekDays[targetDayOfWeek]);
    }

    public static int calculateDaysBetween(int m1, int d1, int m2, int d2, int[] daysInMonth) {
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