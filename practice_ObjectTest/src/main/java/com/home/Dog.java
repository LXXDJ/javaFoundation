package com.test;

import java.awt.print.Book;
import java.util.Arrays;

public class Dog {
    /* 강아지 속성 : 이름(String), 재주(String[]) */
    private String dogName;
    private String[] talent;

    public Dog(){}
    public Dog(String dogName){this.dogName = dogName;}
    public Dog(String[] talent){
        this.talent = talent;
    }

    public void setDogName(String dogName){this.dogName = dogName;}
    public void setTalent(String[] talent){this.talent = talent;}

    public String getDogName(){return dogName;}
    public String[] getTalent(){return talent;}


    @Override
    public String toString(){
//        return "강아지 이름 : " + dogName + ", 재주 : " + Arrays.toString(talent);
        return "강아지 이름 : " + dogName + ", 재주 : " + print();
    }

    public void learnTalent(String[] arr){
        talent = arr;
    }

    String result = "";
    public String print(){
        if(talent != null){
            for(int i=0; i<talent.length;i++){
                result += talent[i] + " ";
            }
        }
        return result;
    }

    /* Dog의 반환타입인 void인 메소드 호출 */
//    public void doSomeThingVoid(String str){
//        /* switch 사용 */
//        switch (str){
//            case "앉아" :
//                System.out.println(getDogName() + "(이)가 앉는다.");
//                break;
//            case "빵" :
//                System.out.println(getDogName() + "(이)가 바닥에 눕는다.");
//                break;
//            case "기다려" :
//                System.out.println(getDogName() + "(이)가 시선을 맞추며 기다린다.");
//                break;
//            default:
//                System.out.println("아직 " + getDogName() + "(이)가 못 배운 재주입니다.");
//                break;
//        }
//    }

//    public String doSomeThingVoid(String str){
//        String result = getDogName() + "(이)는 '" + str + "'(을)를 ";
//        /* switch 사용 */
//        switch (str){
//            case "앉아" : break;
//            case "빵" : break;
//            case "기다려" : break;
//            default:
//                result += "몰라요.";
//                return result;
//        }
//        result += "배웠어요.";
//        return result;
//    }

    public Boolean doSomeThingVoid(String str){
        boolean isTure = true;

        /* switch 사용 */
        switch (str){
            case "앉아" : break;
            case "빵" : break;
            case "기다려" : break;
            default:
                isTure = false;
                return isTure;
        }

        return isTure;
    }

}
