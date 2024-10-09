package homeworks.homework_12;

import java.time.Year;
import java.util.Scanner;

public class Home_12_02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isLeap;
        int year;

        System.out.print("Please, enter a year: ");

        if (console.hasNextInt()) {
            year = console.nextInt();
            isLeap = isLeap(year);

            System.out.printf((isLeap ? "The year %d is leap." : "The year %d isn't leap"), year);
        } else {
            System.out.println("You entered incorrect year!");
        }
    }

    private static boolean isLeap(int year) {
        return Year.of(year).isLeap();
    }
}
