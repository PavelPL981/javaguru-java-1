package lesson_3.hw3.level_7_middle;

class BankAccount {

    private String owner;
    private int money;

    BankAccount(String ownerAmount, int moneyAmount) {
        this.owner = ownerAmount;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }
}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String owner = bankAccount.getOwner();
        int money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }
}