package lesson_3.hw3.level_1;

public class RobotApp {

    static void main() {
        Robot mark = new Robot("Mark");
        Robot john = new Robot("John");

        System.out.println(mark.getName());
        System.out.println(john.getName());

        mark.setName("Petr");
        john.setName("Ivan");

        System.out.println(mark.getName());
        System.out.println(john.getName());
    }
}
