package lesson_3.hw3.level_3;

public class BookApp {

    static void main() {
        Book book1 = new Book(
                "Отверженные",
                2026,
                "Виктор Гюго",
                new Chapter("Глава 1", "Текст Главы 1"),
                new Chapter("Глава 2", "Текст Главы 2"));

        Book book2 = new Book(
                "Война и Мир",
                1812,
                "Лев Толстой",
                new Chapter("Глава 3", "Текст Главы 3"),
                new Chapter("Глава 4", "Текст Главы 4"));

        System.out.println(book1);
        System.out.println(book2);

        book1.setAuthor("John Rembo");
        book2.setTitleOfBook("Маугли");

        System.out.println(book1);
        System.out.println(book2);
    }
}
