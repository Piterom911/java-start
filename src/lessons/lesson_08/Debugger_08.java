package lessons.lesson_08;

public class Debugger_08 {

    public static void main (String[] args) {
        int from = 100;
        int to = 10000;

        getAllOdd(from, to);
    }

    private static void getAllOdd(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
