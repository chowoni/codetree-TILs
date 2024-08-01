import java.util.Scanner;

class Info {
    String secretCode;
    char meetingPoint;
    int time;

    public Info(String secretCode, char meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretCode = scanner.next();
        char meetingPoint = scanner.next().charAt(0);
        int time = scanner.nextInt();

        Info info = new Info(secretCode, meetingPoint, time);

        System.out.println("secret code : " + info.secretCode);
        System.out.println("meeting point : " + info.meetingPoint);
        System.out.println("time : " + info.time);
        
        scanner.close();
    }
}