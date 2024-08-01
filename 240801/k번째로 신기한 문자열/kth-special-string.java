import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        sc.nextLine();
        List<String> words = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (word.startsWith(T)) {
                words.add(word);
            }
        }

        Collections.sort(words);
        System.out.println(words.get(k - 1));
    }
}