package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    /* 중첩 for문
     *  for 문 안에서 for문 이용가능 */

    public void printGugudanFromTwoToNine(){
        for(int dan = 2; dan < 10; dan++){
            System.out.println(dan+"단 시작");

            for(int su = 1; su < 10; su++){

                System.out.println(dan +" * " + su + " = " + dan * su);
            }
            
            System.out.println(dan+"단 끝");
        }
    }

    public void printStarInputRowTimes(){
        /* 키보드로 정수를 하나 입력 받아 해당 정수만큼 한 행에 "*"을 5개씩 출력해보기 */
        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 행 수 입력 : ");
        int row = sc.nextInt();

        for(int i = 1; i<= row; i++){
//            for (int j = 1; j<6; j++){
//                System.out.print("*");
//            }
            printStar(5);
            System.out.println();
        }
    }

    public void printStar(int times){
        for(int i = 1; i <= times; i++){
            System.out.print("*");
        }
    }
}
