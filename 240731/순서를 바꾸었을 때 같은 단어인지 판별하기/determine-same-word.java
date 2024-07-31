import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str1 = sc.next().split("");
        String[] str2 = sc.next().split("");

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(Arrays.equals(str1, str2)){
            System.out.print("Yes");
            return;
        }

        System.out.print("No");
    }
}