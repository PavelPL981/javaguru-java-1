package lesson_2.hw2;

import java.util.Scanner;

/**
 * Напишите программу, которая запрашивает у пользователя
 * радиус круга (вещественное число) и печатает на консоль
 * периметр и площадь круга
 */

public class Level3Task2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius: ");
        double radius = scanner.nextDouble();
        printCirclePerimeter(radius);
        printCircleArea(radius);
    }

    public static void printCirclePerimeter(double radius) {
        System.out.println("Circle perimeter = " + 2 * Math.PI * radius);
    }

    public static void printCircleArea(double radius) {
        System.out.println("Circle area = " + Math.PI * Math.pow(radius, 2));
    }
}
