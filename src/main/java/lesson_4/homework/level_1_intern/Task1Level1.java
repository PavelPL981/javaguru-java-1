package lesson_4.homework.level_1_intern;

import java.util.Scanner;

/**
 * Написать программу, которая запрашивает у пользователя
 * целое число от 1 до 7 и выводит на консоль соответствующий
 * этому числу день недели.
 */

public class Task1Level1 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7 (номер дня недели)");

        int number = Integer.parseInt(scanner.nextLine());
        printDayOfWeek(number);
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}
