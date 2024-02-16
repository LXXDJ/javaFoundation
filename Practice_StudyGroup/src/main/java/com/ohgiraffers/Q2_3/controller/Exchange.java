package com.ohgiraffers.Q2_3.controller;

import com.ohgiraffers.Q2_3.dto.*;

import java.util.Scanner;

public class Exchange {
    Scanner sc = new Scanner(System.in);
    private Person person;
    private Money money;
    private Money[] kinds = new Money[]{new USD(), new EUR(), new AUD()};
    double randomRate = 0;
    public void mainPage(){
        System.out.println("오늘의 환율 공시");
        today();

        label: for(;;){
            System.out.println("수수료율 랜덤 할인 이벤트를 진행 중입니다. 참여하시겠습니까? \n1.예 2.아니오");
            int index = sc.nextInt();
            if(index == 1){
                randomEvent();
                break;
            }else if(index == 2){
                break;
            }else{
                System.out.println("보기 중에서 선택해주세요");
                continue label;
            }
        }

        label: while(true){
            System.out.println("환전을 진행하시겠습니까? \n1.예 2.아니오");
            int index = sc.nextInt();
            if(index == 1){
                change();
                break;
            }else if(index == 2){
                break;
            }else{
                System.out.println("보기 중에서 선택해주세요");
                continue label;
            }
        }
    }

    public void today(){
        for (int i=0; i<kinds.length; i++){
            Money str = kinds[i];
            money = str;
            System.out.println(money.toString());
        }
    }

    public void randomEvent(){  // 소수점 둘째자리까지만 출력
        int num = (int)(Math.random()*500);
        randomRate = num * 0.01;
        System.out.println("축하합니다. 수수료율 랜덤 할인 이벤트 " + randomRate + "%에 당첨되셨습니다.");
    }

    public void change(){
        int index;
        int won;
        label1: while (true){
            System.out.println("환전 종류를 선택해주세요. \n1.미국달러 2.유로 3.호주달러");
            index = sc.nextInt()-1;

            if(0 >= index && index >= kinds.length){
                System.out.println("보기 중에서 선택해주세요");
                continue label1;
            }
            break;
        }
//        label2: while (true){
//            System.out.print("얼마를 환전하시겠습니까? (단위 : 만원) : ");
//            won = sc.nextInt();
//
//            if(0 >= won) {
//                System.out.println("음수 또는 0은 입력하실 수 없습니다. 다시 입력해주세요.");
//                continue label2;
//            }
//            break;
//        }
        calc(index, won);
    }

    public void limitCalc(int index, int won){
        Money choose = kinds[index];

        label2: while (true){
            System.out.print("얼마를 환전하시겠습니까? (단위 : 만원) : ");
            won = sc.nextInt();

            if(won <= 0){
                System.out.println("음수 또는 0은 입력하실 수 없습니다. 다시 입력해주세요.");
                continue label2;
            }

            if(index == 0){
                if(won > choose.getLimit()){
                    System.out.println("일일 최고 환전 한도는 ");
                }
            }else if(index == 1){

            }else if(index == 2){

            }

        }

    }

    public void calc(int index, int won){
        // 우대적용 50% 경우 1,010.36 = 1,001.60 +(1,019.12 - 1,001.60)*50%
        Money choose = kinds[index];
        double applyRate = choose.getNotified() + (choose.getBuy() - choose.getNotified()) * (choose.getRate() + this.randomRate);

        // 1달러 = applyRate



    }


}
