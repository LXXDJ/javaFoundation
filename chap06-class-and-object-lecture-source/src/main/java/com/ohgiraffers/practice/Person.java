package com.ohgiraffers.practice;

public class Person {
    private Plants plants = new Plants();
    private boolean isTrue = true;

    public void waterPh(){plants.water();}
    public void windowPh(){plants.window();}

    public boolean turnOff(){
        if(plants.health() == 100){
            System.out.println("꽃이 폈다.");
            this.isTrue = false;
        }else if(plants.health() == 0){
            System.out.println("시듦");
            this.isTrue = false;
        }else{
            this.isTrue = true;
        }
        return this.isTrue;
    }

}
