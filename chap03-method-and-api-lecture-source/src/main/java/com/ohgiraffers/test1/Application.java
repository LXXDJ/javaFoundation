package com.ohgiraffers.test1;

public class Application {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.0f;
        double d = 6.0;
        char ch = 'a';
        boolean isTrue = true;

        int sum = (int)(i+l);
        String result = (sum>0)?"양수":"음수";

        System.out.println(result);


    }
}
