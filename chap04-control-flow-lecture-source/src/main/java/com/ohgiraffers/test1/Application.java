package com.ohgiraffers.test1;

public class Application {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 1.0f;
        double d = 2.0;
        char ch = 'a';
        boolean isTrue = true;

        byte a = (byte)(s+d);       // int 미만의 자료형끼리 연산하면, 자료형이 int 형으로 변환된다.
        System.out.println(b);

        String str = (b > 0)? "양수":"음수";
        System.out.println(str);
    }
}
