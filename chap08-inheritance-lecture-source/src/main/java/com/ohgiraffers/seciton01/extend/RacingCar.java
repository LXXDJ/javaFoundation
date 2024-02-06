package com.ohgiraffers.seciton01.extend;

public class RacingCar extends Car {
    public RacingCar(){
        System.out.println("RacingCar 클래스 기본 생성자 호출");
    }

    @Override
    public void run(){
        System.out.println("레이싱카가 전속으로 질주합니다.");
    }
    public void soundHorn(){
        System.out.println("레이싱카는 경적을 울리지 않습니다.");
    }
    public void stop(){
        System.out.println("레이싱카가 멈춥니다.");
    }
}
