package com.ohgiraffers.test;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sanrio[] goodsArr = new Sanrio[5];

        goodsArr[0] = new Cinnamoroll("시나모롤", 5000, 5.5, "키링");
        goodsArr[1] = new Cinnamoroll("시나모롤 학사모", 8000, 15.5, "인형");
        goodsArr[2] = new Cinnamoroll("시나모롤 하트", 16500, 25, "인형");
        goodsArr[3] = new Kuromi("쿠로미 인형", 16500, 25, 'A');
        goodsArr[4] = new Kuromi("쿠로미 인형", 7000, 13.5, 'B');

        label: while(true){
            System.out.print("1번부터 5번까지 산리오 굿즈가 있어요 \n한번에 구경하고 싶으면 7번을 눌러주세요 \n0번을 누르면 종료합니다 \n어떤 굿즈를 구경할지 숫자를 입력하세요 : ");
            int num = sc.nextInt();

            if(num == 7){
                for(Sanrio i : goodsArr){
                    System.out.println(i.info());
                }
            }else if(num == 0){
                System.out.println("프로그램 종료");
                break;
            }else if(0 < num && num < 6){
                System.out.println(goodsArr[num-1].info());
            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                continue label;
            }
        }

    }
}
