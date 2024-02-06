package com.ohgiraffers.practice;

public class test {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        boolean isTrue;
        int random;                            // random은 왜 초기값을 설정해줘야하지?
        int temp;                                  // temp는 초기값 없어도 되는데??

        for(int i=0; i<lotto.length; i++){

            isTrue = true;   // 만약 전역변수 자리에서 true로 초기화를 해줘버리면
            // 랜덤수가 중복되지 않을 경우 false값으로 while문을 빠져나와서
            // while문을 다시 돌수 없게 된다.
            while(isTrue){
                random = (int)((Math.random()*45)+1);
                isTrue = false;

                for(int a=0; a<i; a++){
                    if(lotto[a] == random){
                        isTrue = true;
                        break;
                    }
                }
                lotto[i] = random;
            }
        }

        for(int i=0; i<lotto.length; i++){
            for(int a=0; a<i; a++){
                if(lotto[a]>lotto[i]){
                    temp = lotto[a];
                    lotto[a] = lotto[i];
                    lotto[i] = temp;
                }
            }
        }

        for (int i : lotto){
            System.out.print(i+" ");
        }
    }
}
