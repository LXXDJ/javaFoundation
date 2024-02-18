package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.util.regex.PatternSyntaxException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try{
            et.checkEnoughMoney(20000, -10000);
        }catch (NotEnoughMoneyException e){
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        }catch (PriceNegativeException e){
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
        }catch (MoneyNegativeException e){
            System.out.println("MoneyNegativeException 발생");
            System.out.println(e.getMessage());
        }finally {  // 예외상황과 상관없이 프로그램 동작
            System.out.println("finally 블럭 실행");
        }
        System.out.println("프로그램 종료");
    }
}
