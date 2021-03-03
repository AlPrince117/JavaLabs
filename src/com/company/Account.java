package com.company;

public class Account {
    private Double totalTrades = 0.0;

    public Double getTotalTrades() {
        return totalTrades;
    }

    public void setTotalTrades(Double totalTrades) {
        this.totalTrades += totalTrades;
//        if (totalTrades==0){
//            this.totalTrades = totalTrades;
//        }else {
//
//        }
    }
}
