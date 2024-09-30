package com.keyin;

public class BankAccount {
    private double dailyWithdrawLimit;
    private double interestRate;
    private double money;
    private int pinNumber;

    public double getDailyWithdrawLimit() {
        return dailyWithdrawLimit;
    }

    public void setDailyWithdrawLimit(double dailyWithdrawLimit) {
        this.dailyWithdrawLimit = dailyWithdrawLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
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

    public BankAccount(double dailyWithdrawLimit, double interestRate, double money, int pinNumber) {
        this.dailyWithdrawLimit = dailyWithdrawLimit;
        this.interestRate = interestRate;
        this.money = money;
        this.pinNumber = pinNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "dailyWithdrawLimit=" + dailyWithdrawLimit +
                ", interestRate=" + interestRate +
                ", money=" + money +
                ", pinNumber=" + pinNumber +
                '}';
    }
}
