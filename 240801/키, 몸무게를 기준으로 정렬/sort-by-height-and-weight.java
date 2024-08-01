import java.util.*;

class Person {
    String name;
    int height;
    int weight;

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int height = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);
            people.add(new Person(name, height, weight));
        }

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.height != p2.height) {
                    return Integer.compare(p1.height, p2.height);
                } else {
                    return Integer.compare(p2.weight, p1.weight);
                }
            }
        });

        for (Person person : people) {
            System.out.println(person);
        }

        scanner.close();
    }
}