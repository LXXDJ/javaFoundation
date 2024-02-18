package com.ohgiraffers.Dajeong.dto;

public class Money {
    String unit;    // 단위
    double notified;    // 고시환율 (KRW : 원)
    double buy;     // 현찰 살 때 환율 (KRW : 원)
    int rate;       // 환율우대 (%)
    int limit;      // 환전 일일한도 (KRW : 만원)

    public Money(){}

    public void setUnit(String unit){this.unit = unit;}
    public void setNotified(double notified) {this.notified = notified;}
    public void setBuy(double buy) {this.buy = buy;}
    public void setRate(int rate) {this.rate = rate;}
    public void setLimit(int limit) {this.limit = limit;}

    public String getUnit(){return unit;}
    public double getNotified() {return notified;}
    public double getBuy() {return buy;}
    public int getRate() {return rate;}
    public int getLimit() {return limit;}

    public String toString(){
        return "[" + unit + "] " + "고시환율 : " + this.notified + "원 / 현찰살때 : " + this.buy + "원 / 환율우대 : " + this.rate + "% / 일일한도 : " + this.limit + "만원";
    }
}
