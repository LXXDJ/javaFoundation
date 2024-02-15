package com.home;

import java.util.Arrays;

public class Dog {
    private String dogName;
    private String[] ability;

    public Dog(String dogName){
        this.dogName = dogName;
    }

    @Override
    public String toString(){
//        return "강아지이름 : " + dogName + ", 재주 : " + Arrays.toString(ability);
        return "강아지이름 : " + dogName + ", 재주 : " + printAbility();
    }

    public void learn(String[] ability){
        this.ability = ability;
    }

    public String printAbility(){
        String str = "";
        if(ability != null){
            for(String i : ability){
                str += i + " ";
            }
        }
        return str;
    }
}
