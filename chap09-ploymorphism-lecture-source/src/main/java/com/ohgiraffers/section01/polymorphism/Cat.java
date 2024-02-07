package com.ohgiraffers.section01.polymorphism;

public class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("고양이가 생선을 먹습니다.");
    }
    public void run(){
        System.out.println("고양이가 달려갑니다.");
    }
    public void cry(){
        System.out.println("야옹");
    }

    public void jump(){
        System.out.println("고양이가 점프합니다.");
    }
}
