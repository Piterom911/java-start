package homeworks.homework_14;

public class Home_14_02 {
    public static void main(String[] args) {
        int amount = 21;
        int days = 0;

        while (amount > 0) {
            for (int i = amount - 1; i >= 1; i--) {
                if (amount % i == 0) {
                    amount -= i;
                    days++;
                    System.out.println("Leaved: " + amount);
                    break;
                }
            }

            if (amount == 1) {
                amount = 0;
                days++;
                System.out.println("Leaved: " + amount);
            }
        }

        System.out.println("Days: " + days);
    }
}


// У вас на банковском счету N долларов.

// Вы хотите снять все, но банк разрешает снять только сумму,
// которая является делителем текущей суммы на счету и меньше текущей суммы.

// Если вы снимаете максимально возможную сумму каждый день,
// сколько дней вам понадобится, чтобы забрать все свои деньги из банка?

// Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//
// Ввод:  N = 21
// Выход:  7
// Объяснение:  N = 21
// Снято 7, осталось = 14
// Снято 7, осталось = 7
// Снято 1, осталось = 6
// Снято 3, осталось = 3
// Снято 1, осталось = 2
// Снято 1, Осталось = 1
// Снято 1, осталось = 0