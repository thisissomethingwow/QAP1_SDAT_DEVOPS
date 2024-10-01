package com.keyin;

public class ATM {
    private double moneyInATM;
    private boolean bankOwnedATM;
    private double atmFees;

    public double getMoneyInATM() {
        return moneyInATM;
    }

    public void setMoneyInATM(double moneyInATM) {
        this.moneyInATM = moneyInATM;
    }


    public double getAtmFees() {
        return atmFees;
    }

    public void setAtmFees(double atmFees) {
        this.atmFees = atmFees;
    }

    public boolean isBankOwnedATM() {
        return bankOwnedATM;
    }

    public void setBankOwnedATM(boolean bankOwnedATM) {
        this.bankOwnedATM = bankOwnedATM;
    }

    public ATM(double moneyInATM, boolean bankOwnedATM, double atmFees) {
        this.moneyInATM = moneyInATM;
        this.bankOwnedATM = bankOwnedATM;
        this.atmFees = atmFees;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "moneyInATM=" + moneyInATM +
                "$, bankOwnedATM=" + bankOwnedATM +
                ", atmFees=" + atmFees +
                '}';
    }

}
