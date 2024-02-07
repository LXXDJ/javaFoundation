package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product {

    /* extends 키워드로 클래스를 상속받을 때 두 개 이상의 클래스는 상속하지 못한다.
    *  추상클래스가 가지는 추상 메소드를 반드시 오버라이딩 해야 한다. (강제성 부여) */

    public SmartPhone(){}
    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스 printSmartPhone 메소드 호출");
    }

    @Override
    public void abstractMethod(){
        // 추상클래스(부모클래스에서)를 상속받은 하위클래스에 무조건 오버라이딩하여 인스턴스 생성해줘야 한다.
        System.out.println("Product 클래스의 abstractMethod를 오버라이딩 한 메소드 호출");
    }
}
