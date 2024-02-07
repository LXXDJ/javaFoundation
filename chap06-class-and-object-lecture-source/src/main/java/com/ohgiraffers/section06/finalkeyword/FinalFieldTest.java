package com.ohgiraffers.section06.finalkeyword;

import javax.swing.plaf.PanelUI;

public class FinalFieldTest {
    /* final
    *  종단의 의미를 가지는 키워드
    *  키워드를 사용할 수 있는 위치는 다양한 편이며, 의미가 약간 다르지만 결국 변경 불가의 의미
    *  1. 지역변수 : 초기화 이후 값 변경 불가
    *  2. 매개변수 : 호출시 전달한 인자 변경 불가
    *  3. 전역변수 : 인스턴스 생성 후 초기화 이후 값 변경 불가
    *  4. 클래스(static)변수 : 프로그램 start 이후 값 변경 불가
    *  5. non-static 메소드 : 메소드 재작성(overriding) 불가
    *  6. static 메소드 : 메소드 재작성(overriding) 불가
    *  7. 클래스 : 상속 불가 */

    /* non-static field에 final 사용 */
//    private final int nonStaticNum;     // 0으로 초기화되고 이후 변경 불가하기 때문에 에러
    private final int NON_STATIC_NUM = 1;
    private final String NON_STATIC_NAME;  // 생성자로 초기화를 해주면 오류 사라짐
    public FinalFieldTest(String nonStaticName){  // 생성자로 초기화
        this.NON_STATIC_NAME = nonStaticName;
    }

    /* static field에 final 사용 */
//    private final int STATIC_NUM;     // 0으로 초기화되고 이후 변경 불가하기 때문에 에러
    private static final int STATIC_NUM = 1;

    /* 생성자를 이용한 초기화 불가
    *  생성자는 인스턴스가 생성되는 시점에 호출되기 때문에 그 전에는 초기화 발생 불가
    *  하지만 static은 프로그램이 start 될때 할당되기 때문에 초기화 되지 않은 상태로 선언된 것과 동일하며
    *  기본값으로 초기화 된 후 값을 변경하지 못하기 때문에 에러 발생 */
    private static final double STATIC_DOUBLE;
//    public FinalFieldTest(double staticDouble){
//        FinalFieldTest.STATIC_DOUBLE = staticDouble;
//    }

    /* 초기화 블럭으로 초기화 */
    static {
        STATIC_DOUBLE = 0.5;
    }

}