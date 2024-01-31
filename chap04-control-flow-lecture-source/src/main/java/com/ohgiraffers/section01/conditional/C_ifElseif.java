package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {
    public void simpleIfElseIfStatement(){
        /* [if-elseif문 표현식]
        *  if(조건식1){
        *       조건식1이 true일 때 실행할 명령문;
        *  }else if(조건식2){
        *       조건식1은 false고, 조건식2는 true일 때 실행할 명령문;
        *  }else{
        *       조건식 1,2 모두 false인 경우 실행할 명령문
        *  }
        *  */

        System.out.print("어떤게 네 도끼냐? 1.금 2.은 3.쇠 : ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer == 1){
            System.out.println("금? 거짓말");
        }else if(answer == 2){
            System.out.println("은? 거짓말");
        }else{
            System.out.println("쇠? 그래");
        }

        System.out.println("끝");

    }

    public void nestedIfElseIfStatement(){
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 이름 : ");
        String name = sc.nextLine();

        System.out.print("학생 점수 : ");
        int point = sc.nextInt();

        /* 학생의 등급을 저장하기 위한 변수 초기화 */
        String grade = "";

        if(point >= 90){
            grade = "A";
            if(point >= 95){
                grade += "+";
            }
        }else if(point >= 80){
            grade = "B";
            if(point >= 85){
                grade += "+";
            }
        }else if(point >= 70){
            grade = "C";
            if(point >= 75){
                grade += "+";
            }
        }else if(point >= 60){
            grade = "D";
            if(point >= 65){
                grade += "+";
            }
        }else{
            grade = "F";
        }

        System.out.println(name + "학생의 점수는 " + point + "이고, 등급은" + grade + "입니다.");
    }
}
