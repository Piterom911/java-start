package lessons.lesson_08;

public class Debugger_08 {
    public static void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num+" is even"); }
        else {
            System.out.println(num+" is odd"); }
    }
    public static void main (String[] args) {
        findEvenOdd(2);
        findEvenOdd(4);
        findEvenOdd(5);
    }
}
