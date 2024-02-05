package com.ohgiraffers.practice;

public class Monster {
    private String name;
    private int hp;

    public void monsterName(String name){
        this.name = name;
        System.out.println(this.name);
    }

    public void monsterHp(int hp){
        this.hp = hp;
        System.out.println(this.hp);
    }
}
