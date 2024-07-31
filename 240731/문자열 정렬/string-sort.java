import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] sp = str.split("");
        Arrays.sort(sp);

        for(int i = 0; i < sp.length; i++)
            System.out.print(sp[i]);
    }
}