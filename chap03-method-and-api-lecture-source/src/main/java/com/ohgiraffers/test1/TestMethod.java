package com.ohgiraffers.test1;

import com.ohgiraffers.section01.method.Calculator;

import java.util.Scanner;

public class TestMethod {
    public void Calculator(int a, int b){
        System.out.println("두 수를 더한 값 : "+ (a+=b));
        System.out.println("두 수를 뺀 값 : "+ (a-=b));
        System.out.println("두 수를 곱한 값 : "+ (a*=b));
        System.out.println("두 수를 나눈 값 : "+ (a/=b));
        System.out.println("두 수를 나눈 나머지값 : "+ (a%=b));
    }

    public double CircleArea(){
        final double circle = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.print("반지름 입력 : ");
        double half = sc.nextDouble();

        double result = circle*half*half;

        return result;
    }

    public static String TestRandom(){
        int random = (int)((Math.random()*10)+1);
        String str = "생성된 난수값은 "+random+" 입니다.";

        return str;
    }

}
