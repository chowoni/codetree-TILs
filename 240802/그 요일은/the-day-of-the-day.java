import java.util.Scanner;

public class Main {

    public static int numOfDays(int m, int d) {
        // 2024년 윤년을 고려한 월별 일수 배열
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        for (int i = 1; i < m; i++) {
            totalDays += days[i];
        }
        
        totalDays += d;
        
        return totalDays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        sc.nextLine();
        String targetDay = sc.nextLine();

        // 요일 배열
        String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int targetDayIndex = -1;

        // 주어진 요일의 인덱스 찾기
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

        // 기준 요일: 2024년 1월 1일이 월요일 (0: Mon)
        int baseDayOfWeek = 0; // 월요일

        // 날짜 범위 내에서 특정 요일이 몇 번 등장하는지 카운트
        int count = 0;
        int startDay = numOfDays(m1, d1);
        int endDay = numOfDays(m2, d2);

        for (int day = startDay; day <= endDay; day++) {
            int dayOfWeek = (baseDayOfWeek + (day - 1)) % 7;
            if (dayOfWeek == targetDayIndex) {
                count++;
            }
        }

        System.out.println(count);
    }
}