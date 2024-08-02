import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int baseTotalMinutes = (11 * 24 * 60) + (11 * 60) + 11;


        int inputTotalMinutes = (a * 24 * 60) + (b * 60) + c;


        if (inputTotalMinutes < baseTotalMinutes) {
            System.out.println(-1);
        } else {
            int difference = inputTotalMinutes - baseTotalMinutes;
            System.out.println(difference);
        }
    }
}