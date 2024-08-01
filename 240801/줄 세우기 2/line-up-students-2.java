import java.util.*;

public class Main {
    static class Student {
        private int height;
        private int weight;
        private int number;

        public Student(int height, int weight, int number) {
            this.height = height;
            this.weight = weight;
            this.number = number;
        }

        public int getHeight() {
            return height;
        }

        public int getWeight() {
            return weight;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return height + " " + weight + " " + number;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students.add(new Student(height, weight, i + 1));
        }

        students.sort((s1, s2) -> {
            if (s1.getHeight() != s2.getHeight()) {
                return Integer.compare(s1.getHeight(), s2.getHeight());
            } else {
                return Integer.compare(s2.getWeight(), s1.getWeight());
            }
        });

        for (Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}