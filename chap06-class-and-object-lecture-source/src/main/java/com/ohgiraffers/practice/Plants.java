package com.ohgiraffers.practice;

public class Plants {

    private int ph = 50;
    private boolean isWater = false;
    private boolean isWindow = false;

    public void water(){
        if(isWater){
            this.ph -= 10;
            System.out.println(this.ph);
            this.isWater = true;
        }else{
            this.ph += 10;
            System.out.println(this.ph);
            this.isWater = true;
        }
        this.isWindow = false;
    }

    public void window(){
        if(isWindow){
            this.ph -= 10;
            System.out.println(this.ph);
            this.isWindow = true;
        }else{
            this.ph += 10;
            System.out.println(this.ph);
            this.isWindow = true;
        }
        this.isWater = false;
    }

    public int health(){
        return this.ph;
    }


}
