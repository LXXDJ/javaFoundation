package com.ohgiraffers.Q2_3.dto;

public class Person {
    private int money;  // 현재 보유 금액

    public Person(){}
    public Person(int money){
        this.money = money;
    }

    public void setMoney(int money){this.money = money;}
    public int getMoney(){return this.money;}

    public String toString(){
        return "현재 보유 금액 : " + this.money;
    }
}
