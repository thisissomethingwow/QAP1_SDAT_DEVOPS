package com.keyin;

public class BankAccount {
    private double dailyWithdrawLimit;
    private double interestRate;
    private double money;

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

    public BankAccount(double dailyWithdrawLimit, double interestRate, double money) {
        this.dailyWithdrawLimit = dailyWithdrawLimit;
        this.interestRate = interestRate;
        this.money = money;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "dailyWithdrawLimit=" + dailyWithdrawLimit +
                ", interestRate=" + interestRate +
                ", money=" + money +
                '}';
    }
}
