package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
        if(price < 0) throw new PriceNegativeException("상품 가격 음수 불가");
        if(money < 0) throw new MoneyNegativeException("보유 금액 음수 불가");
        if(money < price) throw new NotEnoughMoneyException("보유 금액 부족");
        System.out.println("보유 금액 충분. 즐거운 쇼핑하세요");
    }
}
