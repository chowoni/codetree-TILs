import java.util.*;
import java.text.*;

public class Main {
    static class Info {
        private String date;
        private String day;
        private String weather;

        public Info(String date, String day, String weather) {
            this.date = date;
            this.day = day;
            this.weather = weather;
        }

        public String getDate() {
            return date;
        }

        public String getDay() {
            return day;
        }

        public String getWeather() {
            return weather;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();  // consume the leftover newline

        List<Info> infoList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            infoList.add(new Info(parts[0], parts[1], parts[2]));
        }

        Info nearestRainyDay = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        for (Info info : infoList) {
            if ("Rain".equals(info.getWeather())) {
                if (nearestRainyDay == null) {
                    nearestRainyDay = info;
                } else {
                    try {
                        Date currentDate = df.parse(info.getDate());
                        Date nearestDate = df.parse(nearestRainyDay.getDate());
                        if (currentDate.before(nearestDate)) {
                            nearestRainyDay = info;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        if (nearestRainyDay != null) {
            System.out.println(nearestRainyDay.getDate() + " " + nearestRainyDay.getDay() + " " + nearestRainyDay.getWeather());
        } else {
            System.out.println("No rainy day found.");
        }

        scanner.close();
    }
}