package homeworks.homework_17;

import java.util.Arrays;
import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        boolean isIncreased = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 100);
        }
        System.out.println(Arrays.toString(arr));

        int prev = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < prev) {
                isIncreased = false;
                break;
            }
            prev = arr[i];
            isIncreased = true;
        }
        System.out.println("This array is" + (isIncreased ? " " : " NOT ") + "a strictly increasing sequence");
    }
}

// Создайте массив из 5 случайных целых чисел из интервала [10;99]
// Выведите его на консоль в строку.
// Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
