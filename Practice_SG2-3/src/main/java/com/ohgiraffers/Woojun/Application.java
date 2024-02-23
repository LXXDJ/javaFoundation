package com.ohgiraffers.Woojun;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        HashMap map1 = new HashMap();
        HashMap map2 = new HashMap();

        String[] list = new String[]{"가위", "바위", "보"};

        for(int i=1; i<5; i++){
            map1.put(i,list[(int)(Math.random() * list.length)]);
            map2.put(i+4,list[(int)(Math.random() * list.length)]);
        }

        int randomNum1 = (int)(Math.random()*4)+1;
        int randomNum2 = (int)(Math.random()*4)+5;

        String result1 = (String) map1.get(randomNum1);
        String result2 = (String) map2.get(randomNum2);

        System.out.println("map1의 키 "+randomNum1+"이 낸 것 : " + result1);
        System.out.println("map2의 키 "+randomNum2+"이 낸 것 : " + result2);

        String str = "";
        if(result1 == result2) {
            str = "무승부";
        }else if(result1.equals("가위") && result2.equals("바위")){
            str = randomNum2+" 우승";
        }else if(result1.equals("가위") && result2.equals("보")){
            str = randomNum1+" 우승";
        }else if(result1.equals("바위") && result2.equals("가위")){
            str = randomNum1+" 우승";
        }else if(result1.equals("바위") && result2.equals("보")){
            str = randomNum2+" 우승";
        }else if(result1.equals("보") && result2.equals("가위")){
            str = randomNum2+" 우승";
        }else if(result1.equals("보") && result2.equals("바위")){
            str = randomNum1+" 우승";
        }

        System.out.println("대결할 선수는 " + randomNum1 + "과 " + randomNum2 + "입니다");
        System.out.println(str);
    }
}
