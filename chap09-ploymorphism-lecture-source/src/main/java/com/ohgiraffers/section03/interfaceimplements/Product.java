package com.ohgiraffers.section03.interfaceimplements;

/* 클래스에서 인터페이스를 상속받을 때 implements 키워드 사용
*  인터페이스는 여러 개 상속 받을 수 있으며, extends로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스도 추가 상속 가능
*  단, extends 키워드를 앞에 작성하고 implements를 뒤에 작성한다. (순서 바뀌면 에러 발생)
*  (extends Object는 생략 가능) */
public class Product extends Object implements InterProduct, java.io.Serializable {
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출");
    }
    public void abstMethod() {
        System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드 호출");
    }

    @Override
//    public static void staticMethod(){}   // static 메소드는 오버라이딩 불가
//    public default void defaultMethod(){} // default 메소드는 인터페이스에서만 작성 가능하지만
    public void defaultMethod() {           // default 키워드를 생략하면 작성 가능
        InterProduct.super.defaultMethod();
        System.out.println("Product의 defaultMethod 오버라이딩한 메소드 호출");
    }

}
