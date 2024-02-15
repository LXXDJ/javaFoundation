package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("현재 보유 금액은 " + money + "원 입니다.");

        if(money >= price){
            System.out.println("상품 구입을 위한 금액이 충분합니다.");
        }else{
            throw new Exception();              // 여기 밑에 구문은 실행하지 않음
        }

        System.out.println("즐거운 쇼핑하세요.");   // 그래서 else 일때는 여기 출력안됨
    }
}
