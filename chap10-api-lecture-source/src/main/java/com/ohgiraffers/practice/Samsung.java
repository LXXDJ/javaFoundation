package com.ohgiraffers.practice;

public class Samsung extends Stock {
    static { // 정적 초기화 블럭
        volume = 20248727;
    }
    {       // 인스턴스 초기화 블럭
        name = "삼성전자";
        price = 74100;
    }
    public Samsung(){}
    public Samsung(String name, int price, int volume){
        super(name, price);
        Stock.volume = volume;
    }

    public void setVolume(int volume){Stock.volume = volume;}
    public int getVolume(){return Stock.volume;}



}
