package homeworks.homework_09;

import java.util.Random;

public class Home_09_02 {
    public static void main(String[] args) {
        Random rd = new Random();

        int wholeTime = 28800;

        int restSecs = rd.nextInt(0, wholeTime);
        int restHours = restSecs / 60 / 60;

        if (restHours > 0) {
            System.out.printf("Rest hours: %dh. \n", restHours);
        } else {
            System.out.println("Rest time: less than 1 hour.");
        }

        System.out.printf("Rest seconds: %ds.", restSecs);
    }
}
