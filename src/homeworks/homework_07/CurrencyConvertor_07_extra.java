package homeworks.homework_07;

import java.util.Scanner;

public class CurrencyConvertor_07_extra {
    public static double convertToDollars(double euros, double exchangeRate) {
        return euros * exchangeRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in euros: ");
        double euros = scanner.nextDouble();

        double exchangeRate = 1.09;

        double dollars = convertToDollars(euros, exchangeRate);

        System.out.printf("Amount in dollars: %.2f\n", dollars);
    }
}
