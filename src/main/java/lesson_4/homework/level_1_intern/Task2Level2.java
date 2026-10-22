package lesson_4.homework.level_1_intern;

import java.util.Scanner;

public class Task2Level2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        boolean result = isEvenNumber(number);
        System.out.println(result);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
