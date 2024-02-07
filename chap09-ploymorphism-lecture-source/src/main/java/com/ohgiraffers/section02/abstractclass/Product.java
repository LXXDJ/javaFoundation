package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product(){}
    public void nonStaticMethod(){
        System.out.println("Product 클래스의 nonStaticMethod 호출");
    }
    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod 호출");
    }
    public abstract void abstractMethod();


}
