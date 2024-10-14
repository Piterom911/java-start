package homeworks.homework_14;

public class Home_14_01 {
    public static void main(String[] args) {
        double temperature1 = 120;
        double temperature2 = 80;

        System.out.println(worksCorrect(temperature1, temperature2));
    }

    private static boolean worksCorrect(double bulb1, double bulb2) {
        return bulb1 > 100 && bulb2 < 100;
    }
}

//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов,
//а температура второй колбы меньше 100 градусов.
//a. Вы должны написать метод, который проверяет это устройство.
//b. Ваша программа должна иметь переменные temperature1 и temperature2.
//c. В результате метод возвращает true или false.