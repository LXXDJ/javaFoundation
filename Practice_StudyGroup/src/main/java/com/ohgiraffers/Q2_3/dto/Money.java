package com.ohgiraffers.Q2_3.dto;

public class Money {
    double notified;
    double buy;
    int rate;
    int limit;

    public Money(){}
    public Money(double notified, double buy, int rate, int limit) {
        this.notified = notified;
        this.buy = buy;
        this.rate = rate;
        this.limit = limit;
    }

    public void setNotified(double notified) {this.notified = notified;}
    public void setBuy(double buy) {this.buy = buy;}
    public void setRate(int rate) {this.rate = rate;}
    public void setLimit(int limit) {this.limit = limit;}

    public double getNotified() {return notified;}
    public double getBuy() {return buy;}
    public int getRate() {return rate;}
    public int getLimit() {return limit;}

    public String toString(){
        return "고시환율 : " + this.notified + "원 / 현찰살때 : " + this.buy + "원 / 환율우대 : " + this.rate + "% / 일일한도 : " + this.limit + "원";
    }
}
