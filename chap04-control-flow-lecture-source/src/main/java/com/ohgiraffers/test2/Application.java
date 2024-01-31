package com.ohgiraffers.test2;

import com.ohgiraffers.test1.TestMethod;

public class Application {
    public static void main(String[] args) {
        TestMethod ts = new TestMethod();

        ts.Calculator(1,2);
        System.out.println("원의 부피는 "+ ts.CircleArea() +"입니다.");
        System.out.println(ts.TestRandom());
    }

}
