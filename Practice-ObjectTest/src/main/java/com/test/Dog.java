package com.test;

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

}
