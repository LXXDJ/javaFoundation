package com.ohgiraffers.Q2_3.dto;

public class AUD extends Money {
    {
        this.notified = 868.14;
        this.buy = 884.75;
        this.rate = 30;
        this.limit = 500000;
    }

    @Override
    public String toString(){
        return "[호주] " + super.toString();
    }
}