import java.util.Scanner;

class CodeInfo {
    private String code;
    private char color;
    private int second;

    public CodeInfo(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }

    public String getCode() {
        return code;
    }

    public char getColor() {
        return color;
    }

    public int getSecond() {
        return second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String code = scanner.next();
        char color = scanner.next().charAt(0);
        int second = scanner.nextInt();

        CodeInfo info = new CodeInfo(code, color, second);

        System.out.println("code : " + info.getCode());
        System.out.println("color : " + info.getColor());
        System.out.println("second : " + info.getSecond());

        scanner.close();
    }
}