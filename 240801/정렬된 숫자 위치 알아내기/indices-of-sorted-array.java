import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] sequence = new int[N];
        
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            pairs.add(new Pair(sequence[i], i + 1));
        }

        pairs.sort((p1, p2) -> {
            if (p1.value != p2.value) {
                return Integer.compare(p1.value, p2.value);
            } else {
                return Integer.compare(p1.originalIndex, p2.originalIndex);
            }
        });

        int[] result = new int[N];
        for (int newPos = 0; newPos < N; newPos++) {
            Pair pair = pairs.get(newPos);
            result[pair.originalIndex - 1] = newPos + 1;
        }

        for (int pos : result) {
            System.out.print(pos + " ");
        }

        scanner.close();
    }

    static class Pair {
        int value;
        int originalIndex;

        Pair(int value, int originalIndex) {
            this.value = value;
            this.originalIndex = originalIndex;
        }
    }
}