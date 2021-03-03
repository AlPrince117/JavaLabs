package com.company;

public class Trader {
    private String name;
    public Account account;

    public Trader(String name) {
        this.name = name;
        this.account = new Account();
    }



    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        Name = name;
//    }

    public Account getAccount() {
        return account;
    }

//    public void setAccount(Account account) {
//        this.account = account;
//    }

    public void addTrade(Trade t1){
    Double nowTrade = t1.getPrice()*t1.getQuantity();
    account.setTotalTrades(nowTrade);

    }



}
