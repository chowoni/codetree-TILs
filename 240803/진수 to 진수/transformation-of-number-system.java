import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();

        int temp = Integer.parseInt(n, a);

        System.out.print(Integer.toString(temp, b));
    }
}