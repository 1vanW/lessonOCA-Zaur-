package lesson_5;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Ivan";
        human.car = new Car("red","v8");
        human.bankAccount = new BankAccount(100,200);
        human.showInfo();

        human.bankAccount.popolnenieScheta(100);

        System.out.println(human.bankAccount.balance);

        System.out.println(human.bankAccount.snytieScheta(200));
    }

}
