package lesson_5;

public class BankAccount {
    int id;

    int balance;

    BankAccount(int a,int b){
        id = a;
        balance = b;
    }

    int popolnenieScheta(int sum){
        return balance+= sum;
    }
    int snytieScheta(int sum){
        return balance-=sum;
    }
}
