package com.ohgiraffers.practice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//
//        System.out.print("숫자 : ");
//        int num = sc.nextInt();
//
//        if(num == 1){
//            System.out.println("num == 1 : "+num);
//        }
//
//        for(int i = 1;i<=num;i++){
//            if(num%i == 0){
//                System.out.println(i+"\t");
//                count++;
//            }
//        }
//        System.out.println("가 "+num+"의 약수입니다.");
//        if(count==2){
//            System.out.println(num+"은 소수입니다.");
//        }


        /* 코카콜라 스프라이트 밀키스 */
        Scanner sc = new Scanner(System.in);

        System.out.print("음료를 선택 : ");
        String drink = sc.nextLine();

        switch(drink){
            case "코카콜라":
                System.out.println("1000원입니다.");
                break;
            case "스프라이트":
                System.out.println("1200원입니다.");
                break;
            case "밀키스":
                System.out.println("800원입니다.");
            default:
                System.out.println("입력한 음료가 없습니다.");
        }






    }
}
