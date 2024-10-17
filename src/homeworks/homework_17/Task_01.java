package homeworks.homework_17;

import java.util.Arrays;
import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 51);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}


// Создайте массив из 8 случайных целых чисел из интервала [1;50]
// Выведите массив на консоль в строку.
// Замените каждый элемент с нечетным индексом на ноль.
// Снова выведете массив на консоль в отдельной строке.
