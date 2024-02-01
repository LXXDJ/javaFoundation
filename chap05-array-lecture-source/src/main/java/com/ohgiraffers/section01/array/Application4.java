package com.ohgiraffers.section01.array;

public class Application4 {
    public static void main(String[] args) {
        /* [카드뽑기]
        *  1. 문자열 배열에 SPADE, CLOVER, HEART, DIAMOND 저장
        *  2. 문자열 배열에 2, 3, 4, 5, 6, 7, 8, 9, 10, JACK, QUEEN, KING, ACE 저장
        *  3. 위에서 발생시킨 난수를 활용하여 카드를 출력
        *
        *  ===== 출력예시 ====
        *  당신이 뽑은 카드는 DIAMOND 9 카드입니다.
        *  */

        String[] cardKind = new String[]{"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNum = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomKind = (int)(Math.random()*cardKind.length);
        int randomNum = (int)(Math.random()*cardNum.length);

        System.out.println("당신이 뽑은 카드는 "+cardKind[randomKind]+" "+ cardNum[randomNum]+" 카드입니다.");

    }
}
