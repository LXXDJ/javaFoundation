package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    /* 클래스가 초기화 되는 시점에서 인스턴스를 생성한다. */
    private static EagerSingleton eager = new EagerSingleton();

    /* 싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하는 것을 제한한다. */
    // EagerSingleton eager = new EagerSingleton(); 여기에서 new 뒷부분 생성을 막아버림
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return eager;
    }
}
