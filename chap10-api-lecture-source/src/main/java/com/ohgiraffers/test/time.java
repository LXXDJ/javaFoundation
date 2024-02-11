package com.ohgiraffers.test;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        label: while(true){
            System.out.print("시간 입력 (ex. 12:34) : ");
            String[] arr = sc.nextLine().split("[: ]");

            int H = Integer.parseInt(arr[0]);
            int M = Integer.parseInt(arr[1]);

            if((0<=H && H<=23)&&(0<=M && M<=59)){
                if(M-45 < 0){
                    H -= 1;
                    M = 60 + (M-45);
                }else{
                    M -= 45;
                }
                System.out.println(H+" : "+M);
                break;
            }else{
                System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
                continue label;
            }
        }

    }
}
