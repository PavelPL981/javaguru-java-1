package lesson_4.homework.level_2_intern;

import java.util.Scanner;

/**
 * Написать программу, которая запрашивает у пользователя
 * два целых числа и выводит на консоль наименьшее из них.
 * Нельзя пользоваться классом Math, можно использовать только if else.
 */

public class Task2Level2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a first number");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter a second number");
        int b = Integer.parseInt(scanner.nextLine());

        int result = min(a, b);
        System.out.println(result);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}
