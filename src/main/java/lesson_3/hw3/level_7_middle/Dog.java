package lesson_3.hw3.level_7_middle;

public class Dog {

    private String nick;
    private int age;

    public Dog(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }

    public void voice() {
        System.out.println("My nickname is " + this.nick);
    }

    public void birthday() {
        this.age++;
    }

    public void showAge() {
        System.out.println("My age is " + this.age);
    }
}
