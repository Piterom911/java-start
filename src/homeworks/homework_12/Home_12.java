package homeworks.homework_12;

import java.util.Random;

public class Home_12 {
    public static void main(String[] args) {
        Random rd = new Random();
        boolean isEdekaOpen = rd.nextBoolean();
        boolean isReweOpen = rd.nextBoolean();

        System.out.printf("Я могу купить еду, это %b.", canBuy(isReweOpen, isEdekaOpen));
    }

    private static boolean canBuy(boolean isReweOpen, boolean isEdekaOpen) {
        return isReweOpen || isEdekaOpen;
    }
}
