package lessons.lesson_03;

import java.util.Scanner;
import java.util.Locale;

public class Lesson_03 {
    public static void main(String[] args) {
        Scanner calcScanner = new Scanner(System.in);
        calcScanner.useLocale(Locale.ENGLISH);

        System.out.println("Please, type your number:");
        double num1 = calcScanner.nextDouble();

        System.out.println("Please, type your second number:");
        double num2 = calcScanner.nextDouble();

        System.out.println("Please, type a math sign:");
        char sign = calcScanner.next().charAt(0);

        double result  = 0;

        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid math sign!");
                return;
        }

        System.out.printf("Here's your result: %.2f %c %.2f = %.2f", num1, sign, num2, result);
    }
}
