package com.ohgiraffers.seciton01.extend;

public class Car {
    private boolean runningStatus;

    public Car(){
        System.out.println("Car 클래스의 기본 생성자로 호출");
    }
    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달린다.");
    }

    /* private이 아닌 protected를 써줘야 한다. (자식클래스에서 접근하기 위해) */
    protected void soundHorn(){
        if(isRunning()) {
            System.out.println("빵!빵!");
        }else{
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }

    /* private이 아닌 protected를 써줘야 한다. (자식클래스에서 접근하기 위해) */
    protected boolean isRunning(){
        /* 자동차의 주행중 상태를 반환하는 기능 수행 */
        return runningStatus;
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춘다.");
    }
}
