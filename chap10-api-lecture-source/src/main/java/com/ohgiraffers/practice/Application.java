package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Stock samsung = new Samsung();
        Stock sk = new SK_hynix("SK하이닉스", 1428000, 103.9587);

        Scanner sc = new Scanner(System.in);

        int choose = 0;

        label: while(true){

            System.out.print("거래종목 입력(삼성/SK) : ");
            String stockName = sc.nextLine();

            if(stockName.equals("삼성")){
                System.out.println(stockName+"의 현재가는 "+samsung.price+" 입니다.");
                choose = samsung.price;

            }else if(stockName.equals("sk") || stockName.equals("SK")){
                System.out.println(stockName+"의 현재가는 "+sk.price+" 입니다.");
                choose = sk.price;

            }else{
                System.out.println("'삼성' 또는 'SK' 둘 중 하나의 종목을 입력해주세요.");
                continue label;
            }

            System.out.print("원하는 매수량 : ");
            int stockVolume = sc.nextInt();

            System.out.println(stockName+" 주식 "+stockVolume+"주 매수 실행 실패 \n현재 계좌에 현금 보유액이 "+(choose * stockVolume)+"원 이하입니다.");

            break;

        }

    }
}
