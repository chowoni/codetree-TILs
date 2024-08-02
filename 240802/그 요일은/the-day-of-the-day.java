import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 읽기
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String targetDay = scanner.nextLine().trim();

        // 요일 매핑
        DayOfWeek targetDayOfWeek = mapDayOfWeek(targetDay);

        // 날짜 계산
        LocalDate startDate = LocalDate.of(2024, m1, d1);
        LocalDate endDate = LocalDate.of(2024, m2, d2);

        int count = 0;
        LocalDate currentDate = startDate;
        
        // 날짜 반복 및 요일 카운트
        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfWeek() == targetDayOfWeek) {
                count++;
            }
            currentDate = currentDate.plusDays(1);
        }

        // 결과 출력
        System.out.println(count);
    }

    // 요일 문자열을 DayOfWeek enum으로 변환
    private static DayOfWeek mapDayOfWeek(String day) {
        switch (day) {
            case "Mon": return DayOfWeek.MONDAY;
            case "Tue": return DayOfWeek.TUESDAY;
            case "Wed": return DayOfWeek.WEDNESDAY;
            case "Thu": return DayOfWeek.THURSDAY;
            case "Fri": return DayOfWeek.FRIDAY;
            case "Sat": return DayOfWeek.SATURDAY;
            case "Sun": return DayOfWeek.SUNDAY;
            default: throw new IllegalArgumentException("Invalid day: " + day);
        }
    }
}