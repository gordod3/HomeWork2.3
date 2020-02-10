package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount igor = new BankAccount(10_000);
        for ( ; ; ) {
            try {
                System.out.println("Игорь снимает со своего счета в банке 6 000 рублей...");
                igor.withDraw(6_000);
                System.out.println("его счет теперь = " + igor.getAmount());
            }catch (LimitException d){
                System.out.println("Банкомат выводит ошибку в тексте которой написано:\n" + d.getMessage() + "\nС вашего счета будет снят остаток = " + igor.getAmount());
                igor.setAmount(0);
                break;
            }
        }
    }
}
