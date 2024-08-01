import java.util.*;

public class Main {
    static class Info {
        private String name;
        private int height;
        private int weight;

        public Info(String name, int height, int weight) {
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

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return name + " " + height + " " + weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Info> infoList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(" ");
            String name = data[0];
            int height = Integer.parseInt(data[1]);
            int weight = Integer.parseInt(data[2]);
            infoList.add(new Info(name, height, weight));
        }

        infoList.sort(Comparator.comparingInt(Info::getHeight));

        for (Info info : infoList) {
            System.out.println(info);
        }

        sc.close();
    }
}