package lesson_4.homework.level_3_junior;

import java.util.Scanner;

/**
 * Написать программу, которая запрашивает у пользователя
 * три целых числа и выводит на консоль наибольшее из них.
 *
 * PS: перед решением этой задачи распишите на бумаге
 * или в комментарии все возможные варианты (комбинации).
 * Это поможет вам правильно написать программу!
 * Нельзя пользоваться классом Math.
 */

public class Task1Level3 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a first number");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter a second number");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter a second number");
        int c = Integer.parseInt(scanner.nextLine());

        int result = maxOfThreeNumbers(a, b, c);
        System.out.println(result);
    }

    public static int maxOfThreeNumbers(int a, int b, int c) {
        return Math.max(a, maxOfTwoNumbers(b, c));
    }

    private static int maxOfTwoNumbers(int a, int b) {
        return Math.max(a, b);
    }
}
