import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String st = sc.next();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i].contains(st))
                k--;

            if (k == 0) {
                System.out.print(arr[i]);
                return;
            }
        }
    }
}