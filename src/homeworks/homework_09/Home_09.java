package homeworks.homework_09;

import java.util.Scanner;

public class Home_09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double m = console.nextDouble();

        System.out.print("Enter second number: ");
        double n = console.nextDouble();

        double target = 10.0;

        double diffM = Math.abs(target - m);
        double diffN = Math.abs(target - n);

        if (diffM < diffN) {
            System.out.println("The number " + m + " is closer to 10.");
        } else if (diffN < diffM) {
            System.out.println("The number " + n + " is closer to 10.");
        } else {
            System.out.println("Both of these numbers are equally far from 10.");
        }
    }
}
