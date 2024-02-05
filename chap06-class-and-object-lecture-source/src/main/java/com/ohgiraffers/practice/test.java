package com.ohgiraffers.practice;

import java.util.Scanner;

public class test {
    // private 으로 필드 직접 접근 제한
    private String kinds;
    private int hp;

    // public 메소드를 이용해 간접 접근 허용
    public void setKinds(String kinds){
        this.kinds = kinds;
    }
    public void setHp(int hp){
        if(hp>0){           // 검증하는 로직 추가
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }
    public String getInfo(){
        return "몬스터의 종류는 "+this.kinds+"이고, 체력은 "+this.hp+"입니다.";
    }
}
