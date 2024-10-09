package homeworks.homework_12;

import java.util.Scanner;

public class Home_12_03 {
    public static void main(String[] args) {
        int num1 = getNum("Please, enter the first integer: ");
        int num2 = getNum("Please, enter the second integer: ");
        int num3 = getNum("Please, enter the third integer: ");

        int maxValue = Integer.max(num1, Integer.max(num2, num3));

        System.out.printf("The biggest integer is %d.", maxValue);
    }

    private static int getNum(String prompt) {
        Scanner console = new Scanner(System.in);
        int num;
        System.out.print(prompt);

        while (true) {
            if (console.hasNextInt()) {
                num = console.nextInt();
                break;
            } else {
                System.out.print("The entered integer is incorrect. Enter correct integer: ");
                console.nextLine();
            }
        }

        return num;
    }
}
