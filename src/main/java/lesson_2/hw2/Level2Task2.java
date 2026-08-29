package lesson_2.hw2;

import java.util.Scanner;

public class Level2Task2 {

    static void main() {
        print(inputName());
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void print(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
