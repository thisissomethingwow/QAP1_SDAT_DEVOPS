package com.keyin;

public class Main {
    public static void main(String[] args) {
        ATM atm1 = new ATM(1000.0,100.0,3.00);
        System.out.println(atm1);

        BankAccount bk1 = new BankAccount(150.0,19.50, 1000.0,1234);
        System.out.println(bk1);

        User Jimbob = new User("Jimbob","JimulusBobuls",20,"2004-09-30","gander",bk1);
        System.out.println(Jimbob);

    }
}
