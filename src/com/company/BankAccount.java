package com.company;

public class BankAccount {

    private double amount; // остаток на счете.

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum){ // положить деньги на счет
        amount += sum;
    }

    public void withDraw(double sum) throws LimitException{// снять деньги со счета
        if (amount < sum){
            throw  new LimitException("У вас недостаточно средств на счету.", amount);
        }
        setAmount(amount -= sum);
    }

    public double getAmount() { // текущий счет
        return amount;
    }

    public void setAmount(double amount) {
        if (amount < 0){
            amount = 0;
        }
        this.amount = amount;
    }
}
