package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        /* Q1.
         * 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

        int total = 0;

        for(int i = 1; i<=num; i++){
            if(i % 2 == 0){
                total += i;
            }
        }

        System.out.println("1부터 " + num + " 까지 짝수의 합 : " + total);


        /* Q2.
         * 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 토마토마토
         * */

        String str = "";

        for(int i = 1; i<=num; i++){
            if(i % 2 == 0){
                str += "마";
            }else{
                str += "토";
            }
        }

        System.out.println(str);

    }
}
