import java.util.Scanner;

class UserInfo {
    String id;
    int level;


    public UserInfo(String id, int level) {
        this.id = id;
        this.level = level;
    }

    @Override
    public String toString() {
        return "user " + id + " lv " + level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        UserInfo user1 = new UserInfo("codetree", 10);

        String userId = scanner.next();
        int level = scanner.nextInt();
        UserInfo user2 = new UserInfo(userId, level);

        System.out.println(user1);
        System.out.println(user2);

        scanner.close();
    }
}