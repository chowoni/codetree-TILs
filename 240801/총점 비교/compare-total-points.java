import java.util.*;

public class Main {
    static class Info {
        private String name;
        private int kor;
        private int eng;
        private int math;

        public Info(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        public String getName() {
            return name;
        }

        public int getKor() {
            return kor;
        }

        public int getEng() {
            return eng;
        }

        public int getMath() {
            return math;
        }

        public int getTotal() {
            return kor + eng + math;
        }

        @Override
        public String toString() {
            return name + " " + kor + " " + eng + " " + math;
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
            int kor = Integer.parseInt(data[1]);
            int eng = Integer.parseInt(data[2]);
            int math = Integer.parseInt(data[3]);
            infoList.add(new Info(name, kor, eng, math));
        }

        infoList.sort(Comparator.comparingInt(Info::getTotal));

        for (Info info : infoList) {
            System.out.println(info);
        }

        sc.close();
    }
}