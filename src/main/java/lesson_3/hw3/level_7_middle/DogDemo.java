package lesson_3.hw3.level_7_middle;

public class DogDemo {

    static void main() {
        Dog dog = new Dog("Rex", 3);
        System.out.println(dog);

        dog.voice();
        dog.showAge();
        dog.birthday();
        dog.showAge();

        System.out.println(dog);
    }
}
