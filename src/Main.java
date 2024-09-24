import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //   Task #1
        char chG = 'G';
        int num = 89;
        byte smallNum = 4;
        short shortNum = 56;
        float floatNum = 4.7333436f;
        double doubleNum = 4.355453532d;
        long longNum = 12121L;

        System.out.printf("Character: %c %n", chG);
        System.out.printf("Integer: %d %n", num);
        System.out.printf("Byte: %d %n", smallNum);
        System.out.printf("Short: %d %n", shortNum);
        System.out.printf("Float: %f %n", floatNum);
        System.out.printf("Double: %f %n", doubleNum);
        System.out.printf("Long: %d %n", longNum);


        //   Task #2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a three-digit number: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        System.out.printf("Number %d -> %d, %d, %d%n", number, hundreds, tens, ones);
    }
}