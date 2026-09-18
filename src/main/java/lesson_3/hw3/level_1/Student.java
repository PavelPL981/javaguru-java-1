package lesson_3.hw3.level_1;

public class Student {

    private String name;
    private int age;
    private int studentId;

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public void study() {
        System.out.println("I'm studying!");
    }

    public void takeExams() {
        System.out.println("Taking exams...");
    }
}
