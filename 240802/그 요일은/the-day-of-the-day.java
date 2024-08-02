import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] weekDaysIndex = new int[]{0, 1, 2, 3, 4, 5, 6}; // Mon = 0, ..., Sun = 6

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        sc.nextLine();
        String targetDay = sc.nextLine();

        int startDayOfWeek = 0; // 2024년 1월 1일이 월요일이라고 가정
        int targetDayIndex = -1;

        // Find the index of the target day
        for (int i = 0; i < weekDays.length; i++) {
            if (weekDays[i].equals(targetDay)) {
                targetDayIndex = i;
                break;
            }
        }

        if (targetDayIndex == -1) {
            System.out.println("Invalid day input");
            return;
        }

        int count = 0;

        for (int month = m1; month <= m2; month++) {
            for (int day = 1; day <= daysInMonth[month - 1]; day++) {
                if ((month == m1 && day < d1) || (month == m2 && day > d2)) {
                    continue;
                }
                int totalDays = calculateDaysFromStart(month, day, daysInMonth);
                int dayOfWeek = (startDayOfWeek + totalDays) % 7;
                if (dayOfWeek == targetDayIndex) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static int calculateDaysFromStart(int month, int day, int[] daysInMonth) {
        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days += daysInMonth[i];
        }
        days += day - 1; // Start day is included
        return days;
    }
}