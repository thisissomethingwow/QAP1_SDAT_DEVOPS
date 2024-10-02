package com.keyin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ATMTest {

    @Test
    void testATMConstructor(){
        ATM atm = new ATM(1000,true,3);
        assertEquals(1000,atm.getMoneyInATM());
        assertTrue(atm.isBankOwnedATM());
        assertEquals(3,atm.getAtmFees());


    }
  
}