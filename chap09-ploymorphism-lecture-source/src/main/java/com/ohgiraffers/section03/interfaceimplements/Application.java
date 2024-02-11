package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {
        /* [인터페이스(interface)]
        *  자바의 클래스와 유사한 형태이지만 추상메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
        *
        *  [인터페이스의 목적]
        *  1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을 부여할 목적으로 사용 (표준화)
        *  2. 자바의 단일상속 단점을 극복 (다중 상속) */

        /* 인스턴스를 생성하지 못하고, 생성자 자체가 존재하지 않는다. */
//        InterProduct interProduct = new InterProduct();   // 에러발생

        /* 레퍼런스 타입으로만 사용 가능 */
        InterProduct interProduct = new Product();

        interProduct.nonStaticMethod();
        interProduct.abstMethod();

        /* 오버라이딩 하지 않으면 인터페이스의 default 메소드로 호출됨
        *  default 메소드는 오버라이딩 하지 않아도 오류가 나지 않는다.
        *  Product에 오버라이딩 부분을 지우면 InterProduct의 default 메소드 부분이 출력될 뿐 */
        interProduct.defaultMethod();

        /* static 메소드는 인터페이스명.메소드명(); 으로 호출 */
        InterProduct.staticMethod();

        /* 상수 필드 접근도 인터페이스명.필드명으로 접근함 */
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);

    }
}
