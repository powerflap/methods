public class Main {
    public static String calculationLeapYear(int year) {
        if (year < 1854) {
            return "Год не может быть меньше 1854";
        }
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return year + " — високосный год";
        } else {
            return year + " — не високосный год";
        }
    }
    public static String clientDeviceYear(int clientOS, int year) {
        int iOS1 = 0;
        int android1 = 1;

        if (clientOS == iOS1 && year >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == iOS1 && year < 2015) {
            return "Установите облегчённую версию приложения для iOS по ссылке";
        } else if (clientOS == android1 && year >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        } else {
            return "Установите облегчённую версию приложения для Android по ссылке";
        }
    }
    public static String deliveryDistance(int distanceKm) {
        if (distanceKm < 20) {
            return "Потребуется 1 день на доставку";
        } else if (distanceKm >= 20 && distanceKm < 60) {
            return "Потребуется 2 дня на доставку";
        } else if (distanceKm >= 60 && distanceKm < 100) {
            return "Потребуется 3 дня на доставку";
        } else {
            return "Доставка не производится";
        }
    }
    public static void main(String[] args) {
        System.out.print("Задание №1");
        System.out.println();
        System.out.println(calculationLeapYear(1994));
        System.out.println();
        System.out.print(" Задание №2");
        System.out.println();
        System.out.println(clientDeviceYear(1, 2000));
        System.out.println();
        System.out.print(" Задание №3");
        System.out.println();
        System.out.println(deliveryDistance(200));
    }
}
