package com.ohgiraffers.section03.math;

import org.w3c.dom.ls.LSOutput;

public class Application2 {
    public static void main(String[] args) {
        /* 난수의 활용
        *  (int)(Math.random()*구하려는 난수의 개수) + 구하려는 난수의 최솟값 */

        int random1 = (int)(Math.random() * 10);        // 0부터 9까지 난수 발생
        System.out.println("0부터 9까지 난수 : " + random1);

        int random2 = (int)(Math.random() * 10) + 1;    // 1부터 10까지 난수 발생
        System.out.println("1부터 10까지 난수 : " + random2);

        int random3 = (int)(Math.random() * 6) + 10;    // 10부터 15까지 난수 발생
        System.out.println("10부터 15까지 난수 : " + random3);

    }
}
