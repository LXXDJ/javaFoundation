package com.ohgiraffers.seciton01.extend;

public class FireCar extends Car {  // FireCar 클래스가 Car 클래스(전역변수)를 상속받는다는 뜻
                                    // 생성자와 private 메소드는 상속받지 못한다.
    public FireCar(){
        super();    // 부모의 기본 생성자를 호출하는 구문
        System.out.println("FireCar 클래스 기본생성자 호출");
    }

    /* overriding: 부모 클래스의 메서드와 함수를 자식 클래스에서 재정의하는 것 */
    /* @Override 어노테이션
    *  오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
    *  오버라이딩 하는 메소드는 기본적으로 부모 메스드 선언 내용을 그대로 작성해야 한다. */

    @Override
    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵~ 빵~");
        }else{
            System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세요.");
        }
    }

    /* 물 뿌리는 기능 추가 */
    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ===>>>");
    }

}
