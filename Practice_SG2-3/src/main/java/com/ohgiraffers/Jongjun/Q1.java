package com.ohgiraffers.Jongjun;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "";

        label: while(true){
            System.out.print("정수 입력 : ");
            int num = sc.nextInt();
            sc.nextLine();

            if(num < 1 || 100 < num){
                System.out.println("1부터 100사이의 정수를 입력해주세요");
                continue label;
            }

            for(int i=1; i<=num; i++){
                str += "*";
                System.out.println(str);
            }
            break;
        }
    }
}
