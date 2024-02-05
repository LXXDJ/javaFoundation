package com.ohgiraffers.test2;

import com.ohgiraffers.test1.TestMethod;

public class Application {
    public static void main(String[] args) {

        TestMethod tm = new TestMethod();
        tm.Calculator(5,-10);

        System.out.println("원의 부피 : " +tm.CircleArea());

        String text = TestMethod.TestRandom();
        System.out.println(text);
    }
}