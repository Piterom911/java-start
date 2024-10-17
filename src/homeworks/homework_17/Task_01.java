package homeworks.homework_17;

import java.util.Arrays;
import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randArr = new int[8];

        for (int i = 0; i < 8; i++) {
            randArr[i] = random.nextInt(1, 51);
        }
        System.out.println(Arrays.toString(randArr));

        for (int i = 0; i < randArr.length; i++) {
            if (i % 2 != 0) randArr[i] = 0;
        }
        System.out.println(Arrays.toString(randArr));
    }
}


// Создайте массив из 8 случайных целых чисел из интервала [1;50]
// Выведите массив на консоль в строку.
// Замените каждый элемент с нечетным индексом на ноль.
// Снова выведете массив на консоль в отдельной строке.
