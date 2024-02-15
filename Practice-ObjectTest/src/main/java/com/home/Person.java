package com.home;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String nationality;
    private Dog mydog;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setNationality(String nationality){
//        if(nationality == "한국" || nationality == "일본" || nationality == "중국" || nationality == "홍콩" || nationality == "터키"){
//            this.nationality = nationality;
//        }else{
//            this.nationality = "한국";
//            System.out.println("국적이 한국으로 자동 지정됩니다.");
//        }

        String[] nation = new String[]{"한국","일본","중국","홍콩","터키"};

        for(String i : nation){
            if(nationality.equals(i)){
                this.nationality = nationality;
                return;
            }
        }
        this.nationality = "한국";
        System.out.println("국적이 한국으로 자동 지정됩니다.");

    }

    public Dog getMydog(){return mydog;}

    public String toString(){
        return "이름 : " + name + ", 나이 : " + age + ", 국적 : " + nationality;
    }

    public void adopt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("강아지이름 입력 : ");
        String mydogName = sc.nextLine();

        mydog = new Dog(mydogName);
    }

    public void teach(String[] ability){
        mydog.learn(ability);
    }

}
