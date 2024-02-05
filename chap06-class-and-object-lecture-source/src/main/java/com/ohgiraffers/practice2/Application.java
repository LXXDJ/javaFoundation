package com.ohgiraffers.practice2;

public class Application {
    public static void main(String[] args) {
        BookVO book1 = new BookVO();
        System.out.println(book1.printInfo());

        BookVO book2 = new BookVO("자바의 정석", "도우출판", "남궁성");
        System.out.println(book2.printInfo());

        BookVO book3 = new BookVO("홍길동전","활빈당","허균",5000000,0.5);
        System.out.println(book3.printInfo());
    }
}
