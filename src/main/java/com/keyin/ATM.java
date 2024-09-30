package com.keyin;

public class ATM {
    private double remainingMoney;
    private double withdrawLimits;
    private double atmFees;

    //for the fee it could depend on if the atm is a bank owned one or not


    public double getRemainingMoney() {
        return remainingMoney;
    }

    public void setRemainingMoney(double remainingMoney) {
        this.remainingMoney = remainingMoney;
    }

    public double getWithdrawLimits() {
        return withdrawLimits;
    }

    public void setWithdrawLimits(double withdrawLimits) {
        this.withdrawLimits = withdrawLimits;
    }

    public double getAtmFees() {
        return atmFees;
    }

    public void setAtmFees(double atmFees) {
        this.atmFees = atmFees;
    }

    public ATM(double remainingMoney, double withdrawLimits, double atmFees) {
        this.remainingMoney = remainingMoney;
        this.withdrawLimits = withdrawLimits;
        this.atmFees = atmFees;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "remainingMoney=" + remainingMoney +
                ", withdrawLimits=" + withdrawLimits +
                ", atmFees=" + atmFees +
                '}';
    }
}
