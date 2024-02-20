package com.ohgiraffers.Dajeong.view;

import com.ohgiraffers.Dajeong.controller.stockManager;
import com.ohgiraffers.Dajeong.model.dto.Member;

import java.util.Scanner;

public class stockMenu {
    private Scanner sc = new Scanner(System.in);
    private stockManager sm = new stockManager();

    public stockMenu(){}
    public void mainPage(){
        System.out.println("주식 프로그램 실행");

        System.out.print("이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("현금 입금 : ");
        int money = sc.nextInt();
        sc.nextLine();

        sm.insertInfo(new Member(name, money));

        label: while(true){
            System.out.println("=== 메인 메뉴 ===\n0. 프로그램 종료\n1. 전체 주식보기\n2. 내 정보\n3. 현금 추가입금\n4. 주식 구매\n5. 주식 판매");
            System.out.print("메뉴 선택 : ");
            int index = sc.nextInt();
            sc.nextLine();

            switch (index){
                case 0 :
                    System.out.println("프로그램 종료");
                    break;
                case 1 : sm.displayAll();
                    continue label;
                case 2 : sm.myInfo();
                    continue label;
                case 3 : inputMoney();
                    continue label;
                case 4 : buyStock();
                    continue label;
                case 5 : sellStock();
                    continue label;
            }
            break;
        }
    }

    public void inputMoney(){
        System.out.print("입금 금액 : ");
        int num = sc.nextInt();
        sc.nextLine();

        sm.addMoney(num);
    }

    public void buyStock(){
        sm.displayAll();

        System.out.print("매수할 종목명 입력 : ");
        String ttl = sc.nextLine();
        System.out.print("매수할 종목개수 입력 : ");
        int num = sc.nextInt();
        sc.nextLine();
        boolean isTrue = sm.buyStock(ttl,num);

        if(isTrue){
            System.out.println(ttl + "주식 " + num + "개 매수를 성공하였습니다.");
        }else{
            System.out.println("현재 보유금액이 모자라 " + ttl + " 매수를 실패하였습니다.");
        }
    }
    public void sellStock(){
        sm.myAccount();

        System.out.print("매도할 종목명 입력 : ");
        String ttl = sc.nextLine();
        System.out.print("매도할 종목개수 입력 : ");
        int num = sc.nextInt();
        sc.nextLine();
        int result = sm.sellStock(ttl,num);

        switch (result){
            case 0 :
                System.out.println(ttl + " 주식이 상장폐지 되었습니다.");
                break;
            case 1 :
                System.out.println(ttl + " " + num + "개 매도를 성공하였습니다.");
                break;
            case 2 :
                System.out.println("매도자에 의해 매도가 거절되었습니다.");
                break;
        }
    }
}
