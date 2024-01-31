package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void simpleIfStatement(){
        /* [if문 표현식]
        *  if(조건식){
        *       조건식이 true일 때 실행할 명령문
        *  }
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 한개 입력하세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("입력한 숫자는 짝수입니다");
        }
        System.out.println("프로그램 종료");
    }

    public void nestedIfStatement(){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 한개 입력하세요 : ");
        int num = sc.nextInt();

        if(num > 0){
            if(num % 2 == 0){
                System.out.println("양수이면서 짝수");
            }
            if(num % 2 != 0){
                System.out.println("양수이면서 홀수");
            }
        }
        System.out.println("끝");
    }
}
