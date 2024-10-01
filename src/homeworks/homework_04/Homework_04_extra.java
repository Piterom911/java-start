package homeworks.homework_04;

import java.util.Scanner;

public class Homework_04_extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        System.out.printf("Good day, %s! \n", name);
        System.out.printf("Your name starts with character <%c> and ends with character <%c>.", firstChar, lastChar);
    }
}

