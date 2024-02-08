package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application {
    String stockName;
    int stockPrice;
    int stockVolume;
    public static void main(String[] args) {
        Stock samsung = new Samsung();
        Stock sk = new SK_hynix("SK하이닉스", 1428000, 103.9587);
        Scanner sc = new Scanner(System.in);

        boolean isTrue = true;
        while(isTrue){
            isTrue = false;

            System.out.print("거래종목 입력(삼성/SK) : ");
            stockName = sc.nextLine();
            System.out.print("원하는 매수가격 : ");
            stockPrice = sc.nextInt();
            System.out.print("원하는 매수량 : ");
            stockVolume = sc.nextInt();

            if(stockName.equals("삼성")){
                if(samsung.price == stockPrice){

                }
            }else if(stockName.equals("sk")){

            }else{
                System.out.println("삼성과 sk 중 하나를 입력해주세요");
                isTrue = true;
            }

        }

    }
    public String printInfo(){
        return System.out.println(stockName+" 주식 "+stockPrice+"주 매수 실행 실패 \n현재 계좌에 현금 보유액이 "+(stockPrice*stockVolume)+"원 이하입니다.");
    }
}
