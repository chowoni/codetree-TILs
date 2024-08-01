import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());

            Collections.sort(numbers);
            
            // 홀수 번째 원소일 때 중앙값을 출력합니다.
            if ((i + 1) % 2 != 0) {
                int medianIndex = (i + 1) / 2;
                System.out.print(numbers.get(medianIndex) + " ");
            }
        }
    }
}