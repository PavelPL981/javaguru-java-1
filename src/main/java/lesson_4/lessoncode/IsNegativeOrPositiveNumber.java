package lesson_4.lessoncode;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class IsNegativeOrPositiveNumber {

    static void main() {
        int value = inputNumber();
        System.out.println("Value = " + value);

        boolean isNegative = value < 0;
        boolean isPositive = value > 0;

        if (isNegative) {
            System.out.println("Value is negative = " + isNegative);
        } else if (isPositive) {
            System.out.println("Value is positive = " + isPositive);
        } else {
            System.out.println("Value is zero = " + value);
        }
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        return parseInt(scanner.nextLine());
    }
}
