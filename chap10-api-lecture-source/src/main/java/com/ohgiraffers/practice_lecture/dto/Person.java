package com.ohgiraffers.practice_lecture.dto;

public class Person {
    protected String name;
    private int age;
    private double height;
    private double weight;

    public Person(){}
    public Person(int age, double height, double weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setHeight(double height){this.height = height;}
    public void setWeight(double weight){this.weight = weight;}

    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public double getHeight(){return this.height;}
    public double getWeight(){return this.weight;}

    public String information(){
        return ", 나이 : "+this.age+", 키 : "+this.height+", 몸무게 : "+this.weight;
    }
}
