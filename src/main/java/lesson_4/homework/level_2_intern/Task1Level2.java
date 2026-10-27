package lesson_4.homework.level_2_intern;

import java.util.Scanner;

/**
 * Написать программу, которая запрашивает у пользователя
 * два целых числа и выводит на консоль наибольшее из них.
 * Нельзя пользоваться классом Math, мож
 * но использовать только if else.
 */

public class Task1Level2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a first number");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter a second number");
        int b = Integer.parseInt(scanner.nextLine());

        int result = max(a, b);
        System.out.println(result);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }
}
