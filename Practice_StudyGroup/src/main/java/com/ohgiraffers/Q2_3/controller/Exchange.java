package com.ohgiraffers.Q2_3.controller;

import com.ohgiraffers.Q2_3.dto.*;

import java.util.Scanner;

public class Exchange {
    private Scanner sc = new Scanner(System.in);
    private Money[] kinds = new Money[]{new USD(), new EUR(), new AUD()};
    private int randomRate = 0;
    public void mainPage(){
        System.out.println("오늘의 환율 공시");
        today();

        label: for(;;){
            System.out.println("랜덤 추가 환율우대 이벤트를 진행 중입니다. 참여하시겠습니까? \n1.예 2.아니오");
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
        System.out.println("프로그램 종료");
    }

    public void today(){
        for (int i=0; i<kinds.length; i++){
            System.out.println(kinds[i].toString());
        }
    }

    public void randomEvent(){
        randomRate = (int)(Math.random()*5)+1;
        System.out.println("축하합니다. 환율우대를 " + randomRate + "% 더 받고 환전을 진행하실 수 있습니다.");
    }

    public void change(){
        int index;
        int won = 0;

        label: while (true){
            System.out.println("환전 종류를 선택해주세요. \n1.미국달러 2.유로 3.호주달러");
            index = sc.nextInt()-1;     // 배열을 이용하기 위해서 -1 해줌

            if(0 > index || index > kinds.length -1){
                System.out.println("보기 중에서 선택해주세요");
                continue label;
            }
            break;
        }

        label: while (true){
            Money choose = kinds[index];
            System.out.print("얼마를 환전하시겠습니까?(단위 : 만원) : ");
            won = sc.nextInt();

            if(won < 5){
                System.out.println("최소 환전 가능금액은 5만원부터 입니다. 최소 금액으로 자동 입력되었습니다.");
                won = 5;
                break;
            }

            if(won > kinds[index].getLimit()){
                System.out.println( choose.getUnit() + "의 일일 환전 한도는 " + choose.getLimit() + "만원 입니다. \n최대 금액으로 자동 입력되었습니다.");
                won = choose.getLimit();
                break;
            }

            break;
        }

        calc(index, won);

    }

    public void calc(int index, int won){
        // 우대적용 50% 경우 1,010.36 = 1,001.60 +(1,019.12 - 1,001.60)*50%
        // 우대적용 30% 경우 1,013.864 = 1,001.60 +(1,019.12 - 1,001.60)*70%
        Money choose = kinds[index];
        double applyRate = choose.getNotified() + (choose.getBuy() - choose.getNotified()) * (1-((choose.getRate() + this.randomRate)*0.01));
        int total = (int)(won*10000 / applyRate);

        System.out.println(won + "만원을 " + (choose.getRate() + this.randomRate) + "% 우대받아, " + total + choose.getUnit() + "로 환전하였습니다.");
    }
}
