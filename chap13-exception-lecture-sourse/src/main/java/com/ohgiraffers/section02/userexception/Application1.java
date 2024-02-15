package com.ohgiraffers.section02.userexception;

public class Application1 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try{
//            et.checkEnoughMoney(50000, 30000);    // 보유 금액 부족
//            et.checkEnoughMoney(-50000, 50000);   // 상품 가격 음수 불가
//            et.checkEnoughMoney(50000, -60000);   // 보유 금액 음수 불가
            et.checkEnoughMoney(30000, 50000);  // 보유 금액 충분. 즐거운 쇼핑하세요
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
