package com.ohgiraffers.Q2_3.controller;

import com.ohgiraffers.Q2_3.dto.*;

import java.util.Scanner;

public class Exchange {
    Scanner sc = new Scanner(System.in);
    private Person person;
    private Money money;
    private Money[] kinds = new Money[]{new USD(), new EUR(), new AUD()};
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
        double randomRate = num * 0.01;
        System.out.println("축하합니다. 수수료율 랜덤 할인 이벤트 " + randomRate + "%에 당첨되셨습니다.");
    }

    public void change(){
        label: while (true){
            System.out.println("환전 종류를 선택해주세요. \n1.미국달러 2.유로 3.호주달러");
            int index = sc.nextInt();
            switch (index){
                case 1 : calc(index);
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                default:
                    System.out.println("보기 중에서 선택해주세요");
                    continue label;
            }
        }
    }

    public void calc(int index){
        // 우대적용 50% 경우 1,010.36 = 1,001.60 +(1,019.12 - 1,001.60)*50%

        Money choose = kinds[index];
        choose.getNotified();

        double rate =
    }


}
