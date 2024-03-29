package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {
    private int count;
    public void nonStaticMethod(){
        this.count++;   // 인스턴스 생성 후 사용 가능한 메소드이기 때문에 this에 주소가 들어있다.
        System.out.println("nonStaticMethod 호출");
    }
    public static void staticMethod(){
//        this.count++;   // 인스턴스를 생성하지 않고 사용하는 메소드이기 때문에 this에는 주소가 들어갈 수 없다.
                          // this는 객체의 주소를 갖고 있다. 여기서는 count를 부를 수 없다.
        System.out.println("StaticMethod 호출");
    }
}
