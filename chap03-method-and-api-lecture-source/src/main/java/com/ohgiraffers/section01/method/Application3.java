package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
        /* 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출 */

        /* 변수의 종류
        *  1. 지역변수
        *  2. 매개변수
        *  3. 전역변수(필드)
        *  4. 클래스(static)변수
        *  */

        /* 지역변수는 선언한 메소드 블럭 내부에서만 사용가능. 이것을 지역변수의 스코프라고 한다.
        *  다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        *  이때 전달하는 값을 전달인자(argument)라고 부르고, 메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.*/

        Application3 app3 = new Application3();
        /* 전달인자와 매개변수를 이용한 메소드 호출 테스트 */
        app3.testMethod(40);
//        app3.testMethod("40");        // 문자열을 넣으면 에러남, int 형이 아니기 때문
//        app3.testMethod(20,30,40);    // 매개변수를 여러개 넣어도 에러남, 요구하는 매개변수는 1개이기 때문
//        app3.testMethod();            // 공백이어도 에러남, 매개변수가 선언되어 있는데 인자 값 전달이 안되서

        int age2 = 20;
        app3.testMethod(age2);

        byte byteAge = 10;
        app3.testMethod(byteAge);       // 작은 자료형을 큰 자료형에 담을 때 자동형변환이 일어나서 가능

        long longAge = 60;
//        app3.testMethod(longAge);     // 큰 자료형을 작은 자료형에 담을 때 자동형변환 불가, 에러발생
        app3.testMethod((int)longAge);  // 강제형변환을 이용하여 자료형을 맞춘 후 호출(데이터 손실주의)

        app3.testMethod(age2 * 4);  // 연산된 결과 전달 가능

    }

    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
