package com.keyin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserTest {
    @Test
    void testValidAge(){
        BankAccount bankAccount = new BankAccount(100,1000.0,1234);
        User user = new User("John","Doe",24,"2000-10-01",bankAccount);
        assertEquals("John",user.getfName());
        assertEquals("Doe",user.getlName());
        assertEquals(24,user.getAge());
        assertEquals("2000-10-01",user.getBirthdate());
    }

    @Test
    void testInvalidAge(){
        BankAccount bankAccount = new BankAccount(100,1000.0,1234);
        User user = new User("John","Doe",4,"2020-10-01",bankAccount);

        assertFalse(user.isValidAge(4));
    }

    @Test
    void testSetValidAge(){
        BankAccount bankAccount = new BankAccount(100,1000.0,1234);
        User user = new User("John","Doe",20,"2020-10-01",bankAccount);
        user.setAge(24);
        assertEquals(24, user.getAge());
    }

    @Test
    void testSetInvalidAge(){
        BankAccount bankAccount = new BankAccount(100,1000.0,1234);
        User user = new User("John","Doe",24,"2020-10-01",bankAccount);
        user.setAge(1);
        assertFalse(user.isValidAge(1));
    }
  
}