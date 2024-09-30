package com.keyin;

public class Main {
    public static void main(String[] args) {
        ATM atm1 = new ATM(1000.0,100.0,3.00);
        System.out.println(atm1);

        BankAccount bk1 = new BankAccount(150.0,19.50, 1000.0);
        System.out.println(bk1);

    }
}
