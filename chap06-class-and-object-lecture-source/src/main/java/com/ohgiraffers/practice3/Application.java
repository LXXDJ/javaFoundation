package com.ohgiraffers.practice3;

public class Application {
    public static void main(String[] args) {
        StudentVO st = new StudentVO(1, 2, "홍길동", 175.5, '남');
        System.out.println(st.printInfo());
    }
}
