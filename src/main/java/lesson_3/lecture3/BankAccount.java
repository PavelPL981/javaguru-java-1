package lesson_3.lecture3;

public class BankAccount {

    private String owner;
    private double money;

    public BankAccount() {
    }

    public BankAccount(String owner) {
        this.owner = owner;
    }

    public BankAccount(String owner, double money) {
        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", money=" + money +
                '}';
    }
}
