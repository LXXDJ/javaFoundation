package com.ohgiraffers.test;

public class Sanrio {
    private String name;
    private int price;
    private double size;

    public Sanrio(){};
    public Sanrio(String name, int price, double size){
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public void setName(String name){this.name = name;}
    public void setPrice(int price){this.price = price;}
    public void setSize(double size){this.size = size;}

    public String getName(){return this.name;}
    public int getPrice(){return this.price;}
    public double getSize(){return this.size;}

    public String info(){
        return "캐릭터 : "+this.name+", 가격 : "+this.price+", 사이즈 : "+this.size;
    }
}
