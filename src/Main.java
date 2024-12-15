import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1 ");
        int year = 1994;
        if (year <= 1584) {
            System.out.println("Год должен быть больше, чем 1584.");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("%d год является високосным%n", year);
        } else {
            System.out.printf("%d год не является високосным%n", year);
        }
    }
}