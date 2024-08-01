import java.util.Scanner;

class Agent {
    String codename;
    int score;

    public Agent(String codename, int score) {
        this.codename = codename;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Agent[] agents = new Agent[5];

        for (int i = 0; i < 5; i++) {
            String codename = scanner.next();
            int score = scanner.nextInt();
            agents[i] = new Agent(codename, score);
        }

        Agent lowest = agents[0];
        for (int i = 1; i < agents.length; i++) {
            if (agents[i].score < lowest.score) {
                lowest = agents[i];
            }
        }

        System.out.println(lowest.codename + " " + lowest.score);
        scanner.close();
    }
}