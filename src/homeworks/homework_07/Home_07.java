package homeworks.homework_07;

import java.util.Scanner;

public class Home_07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please, enter the first word:");
        String firstWord = console.next();

        System.out.println("Please, enter the second word:");
        String secondWord = console.next();

        if (firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {
            String firstHalf = firstWord.substring(0, firstWord.length() / 2);
            String secondHalf = secondWord.substring(secondWord.length() / 2);

            String result = firstHalf + secondHalf;

            System.out.println("Result: " + result);
        } else {
            System.out.println("Both words should contain even numbers of characters.");
        }
    }
}
