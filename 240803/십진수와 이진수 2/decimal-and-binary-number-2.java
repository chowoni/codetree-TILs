import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bi = sc.next();

        int n = Integer.parseInt(bi, 2) * 17;

        System.out.print(Integer.toString(n, 2));
    }
}