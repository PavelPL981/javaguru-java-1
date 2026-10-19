package lesson_4.lessoncode;

import java.util.Scanner;

public class ScannerExample {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int numInput = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите строку:");
        String strInput = scanner.nextLine();

        System.out.println("Вы ввели число: " + numInput);
        System.out.println("Вы ввели строку: " + strInput);
    }
}
