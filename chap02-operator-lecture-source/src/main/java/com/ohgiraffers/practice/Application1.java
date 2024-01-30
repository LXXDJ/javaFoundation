package com.ohgiraffers.practice;

public class Application1 {
    public static void main(String[] args) {
        /* Q1.
        *  정수형 변수 2개를 선언하여,
           각 20과 30으로 초기화 한 후,
           두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요.
        * */
        int a = 20;
        int b = 30;

        System.out.println("더하기 : " + (a + b));
        System.out.println("빼기 : " + (a - b));
        System.out.println("곱하기 : " + (a * b));
        System.out.println("나누기 : " + (a / b));
        System.out.println("나머지를 : " + (a % b));

        /* Q2.
        *  사각형의 넓이와 둘레를 구하여 출력합니다.
           너비 12.5 높이 36.4를 변수에 저장하고,
           넓이와 둘레를 계산한 뒤 변수에 담아 아래와 같이 출력하세요.
        * */
        double wd = 12.5;
        double ht = 36.4;
        double rst1 = wd * ht;
        double rst2 = (wd * 2) + (ht * 2);

        System.out.println("면적 : " + rst1);
        System.out.println("둘레 : " + rst2);

        /* Q3.
        *  문자형 변수를 하나 선언하고 'a'를 대입한 후,
           문자 'a'가 가지는 유니코드값을 출력하세요.
        * */
        char txt = 'a';
        int unicode = (int)txt;

        System.out.println("문자 a의 unicode : " + unicode);

        /* Q4.
        *  국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤,
           총점과 평균을 정수 형태로 출력하세요.
        * */
        
        double kor = 80.5;
        double mat = 50.6;
        double eng = 70.8;        
        int total = (int)(kor + mat + eng);
        int average = total / 3;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);


    }
}
