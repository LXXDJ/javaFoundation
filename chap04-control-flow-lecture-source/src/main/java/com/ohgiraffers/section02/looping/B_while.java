package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    /* [while문 표현식]
    *  초기식;
    *  while(조건식){
    *       조건을 만족하는 경우 수행할 구문 (반복구문);
    *       증감식;
    *  }
    *  */

    public void simpleWhileStatement() {
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }

    public void whileExample1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /* charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환
        *  length() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환
        *  index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한개 작은 숫자를 가진다. */

        System.out.println("==== for문 ====");
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(i + " : " + ch);
        }

        System.out.println("==== while문 ====");
        int index = 0;
        while(index < str.length()){
            char ch = str.charAt(index);
            System.out.println(index + " : " + ch);

            index++;
        }
    }

    public void whileExample2(){
        /* 정수 하나를 입력 받아 1부터 입력 받은 정수까지의 합계 */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int num = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println("1부터 " + num + "까지의 합계 : " + sum);
    }

    public void whileExample3(){
        int dan = 2;

        while(dan<10){
            int su = 1;

            while(su<10){
                System.out.println(dan + " * " + su + " = " + (dan*su));
                su++;
            }

            System.out.println();
            dan++;
        }
    }


}
