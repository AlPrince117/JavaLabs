package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {


    @Test
    void addTrade() {
        Trade t1 = new Trade("T1", "APPL", 100, 15.25);
        Trade t2 = new Trade("T2", "APPL", 100, 15.25);
        Trader trader = new Trader("Kwame Prince");
//        Account account = new Account();
//        trader.setAccount(account);

        trader.addTrade(t1);
        trader.addTrade(t2);

        assertEquals(3050,trader.account.getTotalTrades(),"test did not pass");
    }


}