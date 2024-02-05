package com.ohgiraffers.practice;

public class A {
    private String str = "A 클래스";

    public void printStr(String str){
        this.str += str;
        System.out.println(this.str);
    }
}
