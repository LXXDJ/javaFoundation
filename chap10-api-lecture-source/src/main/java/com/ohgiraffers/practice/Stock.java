package com.ohgiraffers.practice;

public class Stock {
    protected String name;
    protected int price;
    static int volume;
    double value;

    public Stock(){};
    public Stock(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){this.name = name;}
    public void setPrice(int price){this.price = price;}

    public String getName(){return this.name;}
    public int getPrice(){return this.price;}

    public String account(){
        return "종목명 : "+this.name+", 현재가 : "+this.price+", 거래량 : "+this.volume+", 시가총액 : "+this.value+"억";
    }
}
