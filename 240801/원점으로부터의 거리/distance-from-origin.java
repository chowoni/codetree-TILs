import java.util.*;

public class Main {

    static class Point {
        int index;
        int x;
        int y;
        int manhattanDistance;

        Point(int index, int x, int y) {
            this.index = index;
            this.x = x;
            this.y = y;
            this.manhattanDistance = Math.abs(x) + Math.abs(y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(i + 1, x, y));
        }

        points.sort((p1, p2) -> {
            if (p1.manhattanDistance != p2.manhattanDistance) {
                return Integer.compare(p1.manhattanDistance, p2.manhattanDistance);
            } else {
                return Integer.compare(p1.index, p2.index);
            }
        });

        for (Point point : points) {
            System.out.println(point.index);
        }

        scanner.close();
    }
}