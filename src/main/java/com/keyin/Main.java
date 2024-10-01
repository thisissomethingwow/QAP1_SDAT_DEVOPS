package com.keyin;

public class Main {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount(100.0,1000.0,1234);
        ATM atm = new ATM(100.0,false,10.0);
        bk.deposit(10000.0);
        bk.checkBalance();
        bk.withdraw(20.0,atm);
        bk.checkBalance();



    }
}
