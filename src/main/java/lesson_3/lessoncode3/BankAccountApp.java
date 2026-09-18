package lesson_3.lessoncode3;

public class BankAccountApp {

    static void main() {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount("Petya");
        BankAccount bankAccount3 = new BankAccount("John", 3.14);

        System.out.println("Bank Account 1: " + bankAccount1);
        System.out.println("Bank Account 2: " + bankAccount2);
        System.out.println("Bank Account 3: " + bankAccount3);
    }
}
