package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner sc = new Scanner(System.in);

        label: do{
            if(person.turnOff()){

                System.out.print("( 1. 물주기 / 2. 창문열기 ) 입력 : ");
                int input  = sc.nextInt();

                if(input == 1){
                    person.waterPh();
                }else if(input == 2){
                    person.windowPh();
                }else{
                    System.out.println("잘못 입력했습니다. 다시 입력해 주세요.");
                    continue label;
                }
            }else{
                System.out.println("프로그램 종료");
                break;
            }
        }while(true);
    }
}
