package com.ohgiraffers.test;

public class Kuromi extends Sanrio{
    private char dollType;

    public Kuromi(){};
    public Kuromi(String name, int price, double size, char dollType){
        super(name, price, size);
        this.dollType = dollType;
    }

    public void setDollType(char dollType){this.dollType = dollType;};
    public char getDollType(){return this.dollType;}

    @Override
    public String info(){
        return super.info()+", 인형 타입 : "+this.dollType;
    }
}
