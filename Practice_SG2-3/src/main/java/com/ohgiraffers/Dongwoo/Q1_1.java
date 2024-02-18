package com.ohgiraffers.Dongwoo;

import java.util.Scanner;

public class Q1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour;
        int minute;
        int takeTime;

        label: while(true){
            System.out.print("현재 시각 입력 : ");
            hour = sc.nextInt();
            if(hour<0 || hour>23){
                System.out.println("0부터 23 사이의 정수만 입력해주세요.");
                continue label;
            }
            break;
        }

        label: while(true){
            System.out.print("현재 분 입력 : ");
            minute = sc.nextInt();
            if(minute<0 || minute>59){
                System.out.println("0부터 59 사이의 정수만 입력해주세요.");
                continue label;
            }
            break;
        }

        label: while(true){
            System.out.print("소요 시간 분단위로 입력 : ");
            takeTime = sc.nextInt();
            if(takeTime<0 || takeTime>1000){
                System.out.println("0부터 1000 사이의 정수만 입력해주세요.");
                continue label;
            }
            break;
        }

        int endHour = 0;
        int endMinute = 0;

        if(minute + takeTime < 61){
            endHour = hour;
            endMinute = minute + takeTime;
        }else{
            int plusHour = (minute + takeTime)/60;
            int plusMinute = takeTime%60;
            endHour = hour + plusHour;
            endMinute = minute + plusMinute;
        }

        System.out.println("[현재 시간] " + hour + " : " + minute);
        System.out.println("[소요 시간] " + takeTime + "분");
        System.out.println("[종료 시간] " + endHour + " : " + endMinute);
    }
}
