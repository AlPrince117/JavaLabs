package com.company;

import static java.lang.Math.abs;

public class Trade {
    private String iD;
    private String symbol;
    private int quantity;
    private double price;

    public int getQuantity() {
        return quantity;
    }

    public Trade(String iD, String symbol, int quantity, double price) {
        this.iD = iD;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String iD, String symbol, int quantity) {
        this.iD = iD;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price>=0){
            this.price=price;
        }else {
            this.price=abs(price);
        }
    }

    public double getPrice() {
        return price;
    }

    //    public String toString(){
//
//    }

   // public abstract void calcDividend();



}
