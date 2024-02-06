package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest(){}

    public int getNonStaticCount(){
        return this.nonStaticCount;
    }
    public int getStaticCount(){
        /* static 필드에 접근하기 위해서는 클래스명.필드명 으로 접근
        *  this. 로도 접근 가능하지만, this. 를 사용하지 않는 것이 좋다. */
        return StaticFieldTest.staticCount;
    }

    public void increaseNonStaticCount(){this.nonStaticCount++;}

    public void increaseStaticCount(){StaticFieldTest.staticCount++;}


}
