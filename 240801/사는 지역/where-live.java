import java.util.Scanner;

class Info {
    private String name;
    private String address;
    private String area;

    public Info(String name, String address, String area) {
        this.name = name;
        this.address = address;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getArea() {
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over

        Info[] infoArray = new Info[n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            String address = parts[1];
            String area = parts[2];

            infoArray[i] = new Info(name, address, area);
        }

        // Find the Info object with the name that is lexicographically largest
        Info slowestNameInfo = infoArray[0];
        for (int i = 1; i < n; i++) {
            if (infoArray[i].getName().compareTo(slowestNameInfo.getName()) > 0) {
                slowestNameInfo = infoArray[i];
            }
        }

        // Output the information
        System.out.println("name " + slowestNameInfo.getName());
        System.out.println("addr " + slowestNameInfo.getAddress());
        System.out.println("city " + slowestNameInfo.getArea());

        scanner.close();
    }
}