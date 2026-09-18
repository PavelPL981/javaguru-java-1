package lesson_3.hw3.level_2;

public class CarApp {

    static void main() {
        Car car1 = new Car("Lada", "black", 150000.05);
        Car car2 = new Car("Toyota", "white", 140000.30);
        Car car3 = new Car("Kamas", "orange", 260000.99);

        System.out.println(car1.getModel());
        System.out.println(car2.getColor());
        System.out.println(car3.getPrice());

        car1.setModel("Mercedes");
        car2.setColor("blue");
        car3.setPrice(3.14);

        System.out.println(car1.getModel());
        System.out.println(car2.getColor());
        System.out.println(car3.getPrice());
    }
}
