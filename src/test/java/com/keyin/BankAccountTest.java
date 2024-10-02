package com.keyin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BankAccountTest {
  @Test
    void testBankAccountConstructor(){
      BankAccount bankAccount = new BankAccount(100,1000,1234);
      assertEquals(100, bankAccount.getDailyWithdrawLimit());
      assertEquals(1000.0,bankAccount.getMoney());
      assertEquals(1234,bankAccount.getPinNumber());
  }

  @Test
  void testCheckBalance(){
    BankAccount bankAccount = new BankAccount(100,1000,1234);
    assertEquals(1000.0,bankAccount.checkBalance(),"should be 1000");
  }

  @Test
  void testDeposit(){
    BankAccount bankAccount = new BankAccount(100,1000,1234);
    assertEquals(1000.0,bankAccount.checkBalance());
    bankAccount.deposit(1);
    assertEquals(1001,bankAccount.checkBalance(),"should be 1001");
  }

  @Test
  void testInvalidDeposit(){
    BankAccount bankAccount = new BankAccount(100,1000,1234);
    assertEquals(1000.0,bankAccount.checkBalance());
    bankAccount.deposit(-1);
    assertEquals(1000,bankAccount.checkBalance(),"should be 1000");
  }

  @Test
  void testWithdraw(){
    BankAccount bankAccount = new BankAccount(100,1000,1234);
    ATM atm = new ATM(100,true,3);
    assertEquals(1000.0,bankAccount.checkBalance());
    bankAccount.withdraw(1,atm);
    assertEquals(999,bankAccount.checkBalance());
  }

  @Test
  void testWithdrawWithFee(){
    BankAccount bankAccount = new BankAccount(100,1000,1234);
    ATM atm = new ATM(100,false,1);
    assertEquals(1000.0,bankAccount.checkBalance());
    bankAccount.withdraw(1,atm);
    assertEquals(998,bankAccount.checkBalance());
  }

  @Test
  void testWithdrawLimit(){
    BankAccount bankAccount = new BankAccount(100,1000,1234);
    ATM atm = new ATM(1000,true,3);
    assertEquals(1000.0,bankAccount.checkBalance());
    bankAccount.withdraw(1000,atm);
    assertEquals(1000.0,bankAccount.checkBalance());
  }


  @Test
  void testWithdrawExceedsBalance(){
    BankAccount bankAccount = new BankAccount(100,1,1234);
    ATM atm = new ATM(1000,true,3);
    assertEquals(1,bankAccount.checkBalance());
    bankAccount.withdraw(2,atm);
    assertEquals(1,bankAccount.checkBalance());
  }

  @Test
  void testWithdrawExceedsATMBalance(){
    BankAccount bankAccount = new BankAccount(100,1000,1234);
    ATM atm = new ATM(1,true,3);
    assertEquals(1000.0,bankAccount.checkBalance());
    bankAccount.withdraw(2,atm);
    assertEquals(1000.0,bankAccount.checkBalance());
  }



}