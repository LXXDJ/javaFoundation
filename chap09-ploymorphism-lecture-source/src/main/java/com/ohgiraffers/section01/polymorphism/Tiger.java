package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {
    @Override
    public void eat(){
        System.out.println("호랑이가 고기를 먹습니다.");
    }
    public void run(){
        System.out.println("호랑이가 달려갑니다.");
    }
    public void cry(){
        System.out.println("어흥");
    }

    public void bite(){
        System.out.println("호랑이가 물어 뜯습니다.");
    }
}
