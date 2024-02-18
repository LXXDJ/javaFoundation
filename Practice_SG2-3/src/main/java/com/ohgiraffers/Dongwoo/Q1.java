package com.ohgiraffers.Dongwoo;

public class Q1 {
    public static void main(String[] args) {
        int hour = (int)(Math.random()*24);
        int minute = (int)(Math.random()*60);
        System.out.println("[현재 시간] " + hour + " : " + minute);

        int takeTime = (int)(Math.random()*1001);
        System.out.println("[소요 시간] " + takeTime + "분");

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

        System.out.println("[종료 시간] " + endHour + " : " + endMinute);
    }
}
