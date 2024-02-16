package com.ohgiraffers.Q2_3.dto;

public class USD extends Money {
    {
        this.notified = 1331.60;
        this.buy = 1355.31;
        this.rate = 90;
        this.limit = 1000000;
    }

    @Override
    public String toString(){
        return "[미국] " + super.toString();
    }
}
