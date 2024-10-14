package homeworks.homework_14;

public class Home_14_03_extra {
    public static void main(String[] args) {
        int floors = 200;
        int stepUp = 50;
        int stepDown = 1;

        int lifts = getNumberOfLifts(floors, stepUp, stepDown);
        System.out.println("Total number of lifts: " + lifts);
    }

    private static int getNumberOfLifts(int floors, int stepUp, int stepDown) {
        int timesUp = 0;
        int currentHeight = 0;

        while (currentHeight < floors) {
            currentHeight += stepUp;
            timesUp++;

            if (currentHeight >= floors) break;

            currentHeight -= stepDown;
        }

        return timesUp;
    }
}

// Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
// Лифт сломан.
// Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъеме
// лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
// Найдите количество подъемов, которые понадобятся лифту.
// Ввод:
// H = 200, N = 50, M = 1
// Ответ: 5
// Объяснение:
// Первый подъем: 50 - 1 = 49
// Второй подъем: 49 + 50 - 1 = 98
// Третий подъем: 98 + 50 - 1 = 147
// Четвертый подъем: 147 + 50 - 1 = 196
// Пятый подъем: выйти за пределы H.
// Реализовать метод getNumberOfLifts(int floors, int stepUp, int stepDown)
