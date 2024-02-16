package com.ohgiraffers.Q2_3.dto;

public class EUR extends Money {
    {
        this.notified = 1433.80;
        this.buy = 1462.64;
        this.rate = 80;
        this.limit = 700000;
    }

    @Override
    public String toString(){
        return "[유럽] " + super.toString();
    }
}
