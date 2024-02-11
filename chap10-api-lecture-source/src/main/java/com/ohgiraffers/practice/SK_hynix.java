package com.ohgiraffers.practice;

public class SK_hynix extends Stock{
    public SK_hynix(){}
    public SK_hynix(String name, int price, double value){
        super(name, price);
        super.value = value;
    }

    public void setValue(double value){super.value = value;}
    public double getValue(){return super.value;}
}
