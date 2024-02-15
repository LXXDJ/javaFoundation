package com.hw1.model.dto;

public class Member {
    private String name;
    private int age;
    private char gender;
    private int couponCount;

    public Member(){}
    public Member(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setGender(char gender){this.gender = gender;}
    public void setCouponCount(int couponCount){this.couponCount = couponCount;}

    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public char getGender(){return this.gender;}
    public int getCouponCount(){return this.couponCount;}

    public String toString(){
        return "이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 쿠폰개수 : " + couponCount;
    }

}
