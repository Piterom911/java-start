package homeworks.homework_07;

public class Calculator_07 {
    public static void main(String[] args) {
        int a = 42, b = 28;

        System.out.println("Sum result: " + sum(a, b));
        System.out.println("Subtraction result: " + sub(a, b));
        System.out.println("Multiplication result: " + mul(a, b));
        System.out.println("Division result: " + div(a, b));
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static float div(int a, int b) {
        return (float) a / b;
    }
}
