package com.ohgiraffers.test1;

import java.util.Scanner;

public class TestMethod {
    public static void Calculator(int num1, int num2){
        System.out.println("두 수를 더한 값은 " + (num1+=num2) + "입니다.");
        System.out.println("두 수를 뺀 값은 " + (num1-=num2) + "입니다.");
        System.out.println("두 수를 곱한 값은 " + (num1*=num2) + "입니다.");
        System.out.println("두 수를 나눈 값은 " + (num1/=num2) + "입니다.");
        System.out.println("두 수를 나눈 값의 나머지는 " + (num1%=num2) + "입니다.");
    }

    public static double CircleArea(){
        double a = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("반지름 : ");
        double num3 = sc.nextInt();
        double circle = a * num3 * num3;

        return circle;
    }

    public static String TestRandom(){
        int num4 = (int)(Math.random() * 10) + 1;
        String result = "생성된 난수는 " + num4 + "입니다.";

        return result;
    }
}
