public class HomeWork_4 {

    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;

        boolean canWalk = isWeekend && !isRain;
        System.out.println("Могу ли я гулять? " + canWalk);

        boolean isEdekaOpen = false;
        boolean isReweOpen = true;

        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Я могу купить еду? " + canBuy);

        int temperature1 = 120;
        int temperature2 = 80;

        boolean deviceWorking = checkDevice(temperature1, temperature2);
        System.out.println("Устройство работает? " + deviceWorking);
    }

    public static boolean checkDevice(int temperature1, int temperature2) {
        boolean isTemperature1Above100 = temperature1 > 100;
        boolean isTemperature2Below100 = temperature2 < 100;

        return isTemperature1Above100 && isTemperature2Below100;
    }
}
