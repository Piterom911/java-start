package homeworks.homework_21;

public class Solution_01 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        System.out.println("Недостающий элемент в первом массиве: " + findMissingElement(arr1, 5));  // out: 4
        System.out.println("Недостающий элемент во втором массиве: " + findMissingElement(arr2, 10)); // out: 9
    }

    public static int findMissingElement(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;

        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }

        return totalSum - arrSum;
    }
}

// Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n .
// Найдите недостающий элемент.

// input:
// arr[] = {1,2,3,5}
// out: 4

// arr[] = {6,1,2,8,3,4,7,10,5}
// out: 9