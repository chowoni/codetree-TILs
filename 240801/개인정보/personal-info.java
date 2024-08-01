import java.util.*;

public class Main {
    static class Student {
        private String name;
        private int height;
        private double weight;

        public Student(String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getHeight() {
            return height;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return name + " " + height + " " + String.format("%.1f", weight);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            students.add(new Student(name, height, weight));
        }

        System.out.println("name");
        students.stream()
            .sorted(Comparator.comparing(Student::getName))
            .forEach(System.out::println);

        System.out.println();

        System.out.println("height");
        students.stream()
            .sorted((s1, s2) -> Integer.compare(s2.getHeight(), s1.getHeight()))
            .forEach(System.out::println);

        sc.close();
    }
}