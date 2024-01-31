package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void simpleSwitchStatement(){
        /* [switch문 표현식]
        *  switch(비교할변수){
        *       case 비교값1 : 비교할변수의 값 == 비교값1 인경우 실행할 구문;
        *       break;
        *       case 비교값2 : 비교할변수의 값 == 비교값2 인경우 실행할 구문;
        *       break;
        *       default : 위 case에 모두 해당하지 않는 경우 실행할 구문;
        *       break;
        *  }
        *  */

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력 : ");
        int firstNum = sc.nextInt();

        System.out.print("두번째 정수 입력 : ");
        int secondNum = sc.nextInt();

        System.out.print("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        /* 연산 결과를 저장할 변수 */
        int result = 0;

        switch (op){
            case '+' : result = firstNum + secondNum;
                break;
            case '-' : result = firstNum - secondNum;
                break;
            case '*' : result = firstNum * secondNum;
                break;
            case '/' : result = firstNum / secondNum;
                break;
            case '%' : result = firstNum % secondNum;
                break;
            default:
                System.out.println("잘못된 연산자를 입력했습니다");
                break;
        }

        System.out.println(firstNum + " " + op + " " + secondNum + " " + result);

    }

    public void switchVendingMachine(){
        /* [switch-case문 이용실습]
        *  1. Scanner를 이용해 음료 이름(String)과 갯수(int)를 입력받는다.
        *  2. switch-case문을 사용해 전체 가격을 구한다.
        *  3. ['음료이름'을 '개수'개 선택하셨습니다. '가격'을 투입해주세요.]와 같이 출력한다.
        *  */

        System.out.println("==== Ohgiraffers Vending Machine ====");
        /* 코카콜라1700원 환타1200원 하늘보리1000원 핫식스2000원 */
        System.out.println("코카콜라 환타 하늘보리 핫식스");

        Scanner sc = new Scanner(System.in);

        System.out.print("음료 선택 : ");
//        String drink = sc.next();
        String drink = sc.nextLine();

        System.out.print("음료 개수 : ");
        int many = sc.nextInt();

        int total = 0;

        switch(drink){
            case "코카콜라": total = many * 1700;
                break;
            case "환타": total = many * 1200;
                break;
            case "하늘보리": total = many * 1000;
                break;
            case "핫식스": total = many * 2000;
                break;
            default:
                System.out.println("없는 음료입니다.");
                return;
        }

        System.out.println(drink +"를 "+ many +"개 선택하셨습니다. " +total+"원을 투입해주세요.");

    }
}
