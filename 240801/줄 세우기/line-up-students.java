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
            if (s2.getHeight() != s1.getHeight()) {
                return s2.getHeight() - s1.getHeight();
            } else if (s2.getWeight() != s1.getWeight()) {
                return s2.getWeight() - s1.getWeight();
            } else {
                return s1.getNumber() - s2.getNumber();
            }
        });

        for (Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}