package lesson_3.lessoncode3;

public class AppleApp {

    static void main() {
        Apple apple1 = new Apple("Antonovka", "Green", 250);
        Apple apple2 = new Apple("Black Prince", "Red", 350);

        System.out.println(apple1);
        System.out.println(apple2);

        apple1.setColor("Yellow");
        apple2.setWeight(400);

        System.out.println(apple1);
        System.out.println(apple2);
    }
}
