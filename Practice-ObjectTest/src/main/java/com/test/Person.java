package com.test;

import java.util.Scanner;

public class Person {
    /* 사람 속성 : 이름(String), 나이(int), 국적(String), 강아지(클래스) => 캡슐화 */
    private String name;
    private int age;
    private String nationality;
    private Dog myDog;

    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setNationality(String nationality){
//        if(nationality=="한국" || nationality=="일본" || nationality=="중국" || nationality=="홍콩" || nationality=="터키"){
//            this.nationality = nationality;
//        }else{
//            this.nationality = "한국";
//            System.out.println("국가를 한국으로 자동지정 합니다.");
//        }

        String[] nationArr = new String[]{"한국", "일본", "중국", "홍콩", "터키"};

        for(int i=0; i<nationArr.length; i++){
            if(nationality.equals(nationArr[i])){
                this.nationality = nationality;
                return;
            }
        }
        this.nationality = "한국";
        System.out.println("국가를 한국으로 자동지정 합니다.");
    }
    public void setMyDog(Dog myDog){this.myDog = myDog;}

    public String getName(){return name;}
    public int getAge(){return age;}
    public String getNationality(){return nationality;}
    public Dog getMyDog(){return myDog;}

    public String toString(){
        return "이름 : " + name + ", 나이 : " + age + ", 국적 : " + nationality + ", 강아지정보 : " + myDog;
    }

    /* 강아지 이름 입력받고, 입력받은 이름을 속성으로 강아지 객체 생성하여 이 사람의 강아지로 설정 */
    public void adoptDog(){
        Scanner sc = new Scanner(System.in);
        System.out.print("강아지 이름 입력 : ");
        String str = sc.nextLine();

        myDog = new Dog(str);
    }

    public void teachDog(String[] arr){
        /* 여기서 myDog로 learnTalent 메소드를 바로 부를 수 있는 이유는
        *  adoptDog 메소드를 거치면서 이미 myDog에 new Dog()가 입력되어 객체가 생성되었기 때문 */
        myDog.learnTalent(arr);
    }
}
