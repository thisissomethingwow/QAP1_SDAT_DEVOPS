package com.keyin;

public class BankAccount {
    private double dailyWithdrawLimit;
    private double money;
    private int pinNumber;

    public double getDailyWithdrawLimit() {
        return dailyWithdrawLimit;
    }

    public void setDailyWithdrawLimit(double dailyWithdrawLimit) {
        this.dailyWithdrawLimit = dailyWithdrawLimit;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public BankAccount(double dailyWithdrawLimit, double money, int pinNumber) {
        this.dailyWithdrawLimit = dailyWithdrawLimit;
        this.money = money;
        this.pinNumber = pinNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "dailyWithdrawLimit=" + dailyWithdrawLimit +
                ", money=" + money +
                ", pinNumber=" + pinNumber +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your Balance is: "+money+"$");
    }

    public void deposit(double depositAmount){
        if (depositAmount<=0){
            System.out.println("Deposit amount cannot be 0 or below");
        }else {
            money += depositAmount;
        }
    }

    public void withdraw(double withdrawAmount,ATM atm){
        if (withdrawAmount>dailyWithdrawLimit){
            System.out.println("withdraw amount cannot be over withdraw limit");
        }else if (withdrawAmount>money){
            System.out.println("not enough money :(");
        } else if (atm.getMoneyInATM()<withdrawAmount) {
            System.out.println("not enough money in ATM");
        } else {
            money -= withdrawAmount;
            if (!atm.isBankOwnedATM()) {
                money -= atm.getAtmFees();
            }
        }
    }


}
