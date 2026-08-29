package lesson_2.hw2;

public class Level3Task1 {

    static void main() {
        printTable(8);
    }

    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (i * number));
        }
    }
}
