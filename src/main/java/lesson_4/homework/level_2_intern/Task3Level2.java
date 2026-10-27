package lesson_4.homework.level_2_intern;

import java.util.Scanner;

/**
 * Написать программу, которая запрашивает у пользователя
 * два целых числа и выводит на консоль:
 * - "Numbers are equals" - если числа равны;
 * - "Numbers are different" - если числа не равны.
 * В решении воспользоваться оператором не равно (!=).
 */

public class Task3Level2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a first number");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter a second number");
        int b = Integer.parseInt(scanner.nextLine());

        if (a != b) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }
    }
}
