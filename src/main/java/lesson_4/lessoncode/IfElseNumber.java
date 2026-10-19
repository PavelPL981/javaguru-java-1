package lesson_4.lessoncode;

import java.util.Scanner;

public class IfElseNumber {

    static void main() {
        System.out.println("Введите первое число:");
        int number1 = inputNumber();

        System.out.println("Введите второе число:");
        int number2 = inputNumber();

        checkBiggerNumber(number1, number2);
    }

    public static void checkBiggerNumber(int a, int b) {
        if (a > b) {
            System.out.println("Первое число больше второго: " + a + " > " + b);
        } else if (a < b) {
            System.out.println("Второе число больше первого: " + b + " > " + a);
        } else {
            System.out.println("Числа равны: " + a + " = " + b);
        }
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
