package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {
    Trade t1 = new Trade("001","AAPL", 40);

    @Test
    void setPrice() {

        t1.setPrice(-3.0);
        System.out.println(t1.getPrice());
        assertEquals(3.0, t1.getPrice(),"this assert didn't pass successfully");

    }
}