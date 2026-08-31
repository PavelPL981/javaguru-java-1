package lesson_2.hw2;

import java.util.Scanner;

/**
 * Напишите программу, которая запрашивает у пользователя
 * три целых числа и выводит их среднее арифметическое
 * (складывает все числа и делит на их количество).
 */

public class Level3Task3 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 1 number: ");
        int a = scanner.nextInt();

        System.out.println("Please enter 2 number: ");
        int b = scanner.nextInt();

        System.out.println("Please enter 3 number: ");
        int c = scanner.nextInt();

        double average = calculateAverage(a, b, c);
        System.out.println("average = " + average);
    }

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
